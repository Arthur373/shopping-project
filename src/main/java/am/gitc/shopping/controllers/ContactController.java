package am.gitc.shopping.controllers;

import am.gitc.shopping.dto.UserDto;
import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.services.EmailSender;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ContactController {

    private final MenuServices menuServices;
    private final EmailSender emailSender;
    private final UserServices userServices;

    public ContactController(MenuServices menuServices, EmailSender emailSender, UserServices userServices) {
        this.menuServices = menuServices;
        this.emailSender = emailSender;
        this.userServices = userServices;
    }

    @GetMapping("/contact")
    public ModelAndView getContact() {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();

        //menus
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");
        modelAndView.addObject("userDto",new UserDto()).setViewName("user/contact/contact_content");

        modelAndView.setViewName("user/contact/contact");
        return modelAndView;
    }

    @PostMapping("/contact")
    public ModelAndView postContact(@Valid UserDto userDto, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        if (!bindingResult.hasErrors()) {
            if (this.userServices.getUserByEmail(userDto.getEmail()) == null) {
                bindingResult
                        .rejectValue("email", "error.userEntity",
                                "wrong email");
            }else {
                this.emailSender.sendSimpleMessage(userDto);
                modelAndView.addObject("success","Mail sending").setViewName("user/contact/contact_content");
            }
        }
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");
        modelAndView.setViewName("user/contact/contact");
        return modelAndView;
    }
}
