package am.gitc.shopping.controllers;

import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {

    private final ProductServices productServices;
    private final DealServices dealServices;

    public SiteController(ProductServices productServices, DealServices dealServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
    }
}
