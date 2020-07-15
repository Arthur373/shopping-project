package am.gitc.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(path = {"/","/home"})
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/home/home");
        return modelAndView;
    }
}
