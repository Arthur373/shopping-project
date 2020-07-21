package am.gitc.shopping.controllers;

import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.IntStream;

@Controller
public class ShopController {

    private final ProductServices productServices;
    private final DealServices dealServices;
    private final MenuServices menuServices;

    public ShopController(ProductServices productServices, DealServices dealServices, MenuServices menuServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
        this.menuServices = menuServices;
    }

    @GetMapping("/shop")
    public ModelAndView getShop(@PageableDefault(size = 6,page = 0) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView();
        // all product , deals , menus
        Page<ProductEntity> products = this.productServices.getAll(pageable);
        List<DealEntity> deals = this.dealServices.getAllDeals();
        List<MenuEntity> menus = this.menuServices.getAllMenu();

        //products
        modelAndView.addObject("products", products)
                 .addObject("numbers", IntStream.range(0,products.getTotalPages()).toArray())
                .setViewName("user/shop/shop_contents");
        //deals
        modelAndView.addObject("deals", deals).setViewName("user/home/deal");

        //menus
        modelAndView.addObject("menus", menus).setViewName("user/home/navigation");

        modelAndView.setViewName("user/shop/shop");
        return modelAndView;
    }



    @GetMapping("/shop/{userId}")
    public ModelAndView getShop(@PathVariable("userId") int userId){
        ModelAndView modelAndView = new ModelAndView();
        // all product , deals , menus
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        ProductEntity product = this.productServices.getProductById(userId);
        List<DealEntity> deals = this.dealServices.getAllDeals();


        modelAndView.addObject("menus",menus).setViewName("user/home/navigation");
        modelAndView.addObject("product",product);
        modelAndView.addObject("deals", deals).setViewName("user/home/deal");

        modelAndView.setViewName("user/shop/single_shop_content");
        return modelAndView;
    }






}
