package am.gitc.shopping.controllers;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SiteController {

    private final MenuServices menuServices;

    public SiteController(MenuServices menuServices) {
        this.menuServices = menuServices;
    }

    public List<MenuEntity> getAllMenu(){
        return this.menuServices.getAllMenu();
    }
}
