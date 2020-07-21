package am.gitc.shopping.controllers;

import am.gitc.shopping.entity.BannerEntity;
import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.BannerServices;
import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    private final ProductServices productServices;
    private final DealServices dealServices;
    private final BannerServices bannerServices;
    private final MenuServices menuServices;

    public HomeController(ProductServices productServices, DealServices dealServices,
                          BannerServices bannerServices, MenuServices menuServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
        this.bannerServices = bannerServices;
        this.menuServices = menuServices;
    }

    @GetMapping(path = {"/", "/home"})
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView();
        // all product , deals , banners , menus
        List<ProductEntity> products = this.productServices.getAllProduct();
        List<DealEntity> deals = this.dealServices.getAllDeals();
        List<BannerEntity> banners = this.bannerServices.getAllBanners();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        Collections.shuffle(products);


        //products
        modelAndView.addObject("products", products.subList(0,8))
                .addObject("coming_products", products.subList(0,8))
                .setViewName("user/home/product");
        //deals
        modelAndView.addObject("deals", deals).setViewName("user/home/deal");
        //banner
        modelAndView.addObject("banners", banners).setViewName("user/home/banner");
        //menu
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");

        modelAndView.setViewName("user/home/home");
        return modelAndView;
    }
}
