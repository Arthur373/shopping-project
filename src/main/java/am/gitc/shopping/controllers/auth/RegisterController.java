package am.gitc.shopping.controllers.auth;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.UserEntity;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.UserServices;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    private final UserServices userServices;
    private final MenuServices menuServices;
    private final PasswordEncoder passwordEncoder;

    public RegisterController(UserServices userServices, MenuServices menuServices, PasswordEncoder passwordEncoder) {
        this.userServices = userServices;
        this.menuServices = menuServices;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        modelAndView.addObject("userEntity", new UserEntity());
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");
        modelAndView.setViewName("auth/register");
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView createNewUser(@Valid UserEntity userEntity, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (!bindingResult.hasErrors()) {
            UserEntity userExists = this.userServices.getUserByEmail(userEntity.getEmail());
            if (userExists != null) {
                bindingResult
                        .rejectValue("email", "error.userEntity",
                                "There is already a user registered with the email provided");
            } else {
                if(!userEntity.getPassword().equals(userEntity.getConfirm())){
                    bindingResult.rejectValue("confirm","error.userEntity","wrong confirm password.");
                }else {
                    userServices.saveUser(userEntity);
                    modelAndView.addObject("successMessage", "User has been registered successfully");
                }
            }
        }
        modelAndView.setViewName("auth/register");
        return modelAndView;
    }

}
