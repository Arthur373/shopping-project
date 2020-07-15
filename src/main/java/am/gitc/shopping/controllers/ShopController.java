package am.gitc.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public ModelAndView getShop(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/shop/shop");
        return modelAndView;
    }
}
