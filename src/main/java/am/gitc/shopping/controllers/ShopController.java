package am.gitc.shopping.controllers;

import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShopController {

    private final ProductServices productServices;
    private final DealServices dealServices;

    public ShopController(ProductServices productServices, DealServices dealServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
    }

    @GetMapping("/shop")
    public ModelAndView getShop(){
        ModelAndView modelAndView = new ModelAndView();
        // all product and deals
        List<ProductEntity> products = productServices.getAllProduct();
        List<DealEntity> deals = dealServices.getAllDeals();

        //products
        modelAndView.addObject("products", products).setViewName("user/shop/shop_contents");
        //deals
        modelAndView.addObject("deals", deals).setViewName("user/home/deal");


        modelAndView.setViewName("user/shop/shop");
        return modelAndView;
    }
}
