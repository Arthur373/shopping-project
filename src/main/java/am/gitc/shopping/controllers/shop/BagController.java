package am.gitc.shopping.controllers.shop;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Controller
public class BagController {

    private final MenuServices menuServices;
    private final ProductServices productServices;

    public BagController(MenuServices menuServices, ProductServices productServices) {
        this.menuServices = menuServices;
        this.productServices = productServices;
    }

    @GetMapping("/bag")
    public ModelAndView getBag(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();

        Enumeration<String> attributeNames = request.getSession().getAttributeNames();
        List<ProductEntity> products = new ArrayList<>();
        while(attributeNames.hasMoreElements()){
            products.add((ProductEntity) request.getSession().getAttribute(attributeNames.nextElement()));
        }


        //menus
        modelAndView.addObject("menus", menus);
        modelAndView.addObject("products", products);

        modelAndView.setViewName("user/bag/bag");
        return modelAndView;
    }

    @PostMapping("/bag")
    public ModelAndView addBag(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        List<MenuEntity> menus = this.menuServices.getAllMenu();

        int productId = Integer.parseInt(request.getParameter("productId"));
         ProductEntity product = this.productServices.getProductById(productId);

         request.getSession().setAttribute("product" + productId,product);


        //menus
        modelAndView.addObject("menus", menus);

        modelAndView.setViewName("user/bag/bag");
        return modelAndView;
    }
}
