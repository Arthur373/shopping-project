package am.gitc.shopping.controllers;

import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

    private final MenuServices menuServices;

    public SiteController(MenuServices menuServices) {
        this.menuServices = menuServices;
    }
}
