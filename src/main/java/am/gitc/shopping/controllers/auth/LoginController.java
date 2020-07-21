package am.gitc.shopping.controllers.auth;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {

    private final MenuServices menuServices;

    public LoginController(MenuServices menuServices) {
        this.menuServices = menuServices;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");
        modelAndView.setViewName("auth/login");
        return modelAndView;
    }
}
