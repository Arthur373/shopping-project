package am.gitc.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public ModelAndView getContact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/contact/contact");
        return modelAndView;
    }

    @PostMapping("/contact")
    public ModelAndView postContact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/contact/contact");
        return modelAndView;
    }
}
