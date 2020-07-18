package am.gitc.shopping.controllers;

import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.IntStream;

@Controller
public class ShopController {

    private final ProductServices productServices;
    private final DealServices dealServices;

    public ShopController(ProductServices productServices, DealServices dealServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
    }

    @GetMapping("/shop")
    public ModelAndView getShop(@PageableDefault(size = 6,page = 0) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView();
        // all product and deals
//        List<ProductEntity> products = productServices.getAllProduct();
        Page<ProductEntity> products = productServices.getAll(pageable);
        List<DealEntity> deals = dealServices.getAllDeals();

        //products
//        modelAndView.addObject("products", products).setViewName("user/shop/shop_contents");
        modelAndView.addObject("products", products)
                 .addObject("numbers", IntStream.range(0,products.getTotalPages()).toArray())
                .setViewName("user/shop/shop_contents");
        //deals
        modelAndView.addObject("deals", deals).setViewName("user/home/deal");


        modelAndView.setViewName("user/shop/shop");
        return modelAndView;
    }
}
