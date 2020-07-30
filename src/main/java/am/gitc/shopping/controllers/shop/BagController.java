package am.gitc.shopping.controllers.shop;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BagController {

    private final MenuServices menuServices;

    public BagController(MenuServices menuServices) {
        this.menuServices = menuServices;
    }

    @GetMapping("/bag")
    public ModelAndView getBag(){
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();

        //menus
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");

        modelAndView.setViewName("user/bag/bag");
        return modelAndView;
    }
}
