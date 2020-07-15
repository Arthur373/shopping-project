package am.gitc.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BagController {

    @GetMapping("/bag")
    public ModelAndView getBag(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/bag/bag");
        return modelAndView;
    }
}
