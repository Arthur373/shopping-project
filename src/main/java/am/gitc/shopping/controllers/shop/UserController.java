package am.gitc.shopping.controllers.shop;

import am.gitc.shopping.dto.UserDto;
import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.UserEntity;
import am.gitc.shopping.mapper.UserMapper;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.UserServices;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    private final UserServices userServices;
    private final MenuServices menuServices;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserController(UserServices userServices, MenuServices menuServices,
                          PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.userServices = userServices;
        this.menuServices = menuServices;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    @GetMapping("/my-profile")
    public ModelAndView editUser() {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserEntity user = userServices.getUserByEmail(auth.getName());
        modelAndView.addObject("user", user);
        modelAndView.addObject("menus", menus);
        modelAndView.setViewName("user/profile/profile");
        return modelAndView;
    }

    @PatchMapping("/my-profile")
    public ModelAndView updateUser(@Valid UserDto userDto,
                                   BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserEntity user = userServices.getUserByEmail(auth.getName());

        if (userDto.getPassword() != null && !userDto.getPassword().isEmpty()) {
            if (!bindingResult.hasErrors()) {
                if (!userDto.getPassword().equals(userDto.getConfirm())) {
                    bindingResult.rejectValue("confirm", "error.user", "wrong confirm password.");
                } else {
                    user.setName(userDto.getName());
                    user.setPassword(passwordEncoder.encode(userDto.getPassword()));
                    userServices.update(user);
                    modelAndView.addObject("successMessage", "User has been updated successfully")
                            .setViewName("user/profile/profile_content");
                }
            }
        } else {
            user.setName(userDto.getName());
            userServices.update(user);
        }
        modelAndView.addObject("user", user);
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");
        modelAndView.setViewName("user/profile/profile");
        return modelAndView;
    }
}
