package am.gitc.shopping.controllers.shop;

import am.gitc.shopping.entity.CategoryEntity;
import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.services.CategoryServices;
import am.gitc.shopping.services.DealServices;
import am.gitc.shopping.services.MenuServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class ShopController {

    private final ProductServices productServices;
    private final DealServices dealServices;
    private final MenuServices menuServices;
    private final CategoryServices categoryServices;

    public ShopController(ProductServices productServices, DealServices dealServices,
                          MenuServices menuServices, CategoryServices categoryServices) {
        this.productServices = productServices;
        this.dealServices = dealServices;
        this.menuServices = menuServices;
        this.categoryServices = categoryServices;
    }
//    @PageableDefault(size = 6, page = 0) Pageable pageable
    @GetMapping("/shop")
    public ModelAndView getShop(HttpServletRequest request,
                                @RequestParam(value = "page",defaultValue = "0") int page,
                                @RequestParam(value = "size",defaultValue = "6") int size
                                ) {
        ModelAndView modelAndView = new ModelAndView();
        Pageable pageable = PageRequest.of(page, size);
        /*** all product , deals , menus  ***/
        List<DealEntity> deals = this.dealServices.getAllDeals();
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        List<CategoryEntity> categories = this.categoryServices.getAllCategories();
        Page<ProductEntity> products = null;

        /*** Category choice ***/
        String slug = request.getParameter("slug");
        CategoryEntity category = null;
        if (slug != null) {
            category = this.categoryServices.getBySlug(slug);
        }
        if (category != null && !category.getProducts().isEmpty()) {
            products = this.productServices.getProductBySlug(category.getSlug(), pageable);
        } else {
            products = this.productServices.getAll(pageable);
        }
        /*** Sorting ***/
        String sort = request.getParameter("sort");
        if (sort != null && sort.equals("asc")) {
            pageable = PageRequest.of(page, size, Sort.by("price").ascending());
            products = this.productServices.getAll(pageable);
        } else if (sort != null && sort.equals("desc")) {
            pageable = PageRequest.of(page, size, Sort.by("price").descending());
            products = this.productServices.getAll(pageable);
        }else if(sort != null && sort.equals("default")){
            pageable = PageRequest.of(page, size, Sort.unsorted());
            products = this.productServices.getAll(pageable);
        }
//        int[] numbers = getPaginationFormat(products);
        int[] numbers = IntStream.range(1, products.getTotalPages()+1).toArray();
        /*** products and categories  ***/
        modelAndView
                .addObject("products", products)
                .addObject("numbers", numbers)
                .addObject("categories", categories)
                .setViewName("user/shop/shop_contents");

        /*** deals ***/
        modelAndView.addObject("deals", deals);

        /*** menus ***/
        modelAndView.addObject("menus", menus);

        modelAndView.setViewName("user/shop/shop");
        return modelAndView;
    }


    @GetMapping("/shop/{userId}")
    public ModelAndView getShop(@PathVariable("userId") int userId) {
        ModelAndView modelAndView = new ModelAndView();
        // all product , deals , menus
        List<MenuEntity> menus = this.menuServices.getAllMenu();
        ProductEntity product = this.productServices.getProductById(userId);
        List<DealEntity> deals = this.dealServices.getAllDeals();


        modelAndView.addObject("menus", menus);
        modelAndView.addObject("product", product);
        modelAndView.addObject("deals", deals);

        modelAndView.setViewName("user/shop/single_shop_content");
        return modelAndView;
    }



//    private int[] getPaginationFormat(Page<ProductEntity> products) {
//        int[] numbers;
//        if (products.getTotalPages() > 7) {
//            int totalPages = products.getTotalPages();
//            int pageNumber = products.getNumber() + 1;
//            int[] head = pageNumber > 3 ? new int[]{1, -1} : new int[]{1, 2};
//            int[] tail = pageNumber < totalPages - 2 ? new int[]{-1, totalPages}
//                    : new int[]{totalPages - 1, totalPages};
//
//            int[] numBefore = (pageNumber > 3 && pageNumber < totalPages - 1)
//                    ? new int[]{pageNumber - 1} : new int[]{};
//
//            int[] numAfter = (pageNumber > 1 && pageNumber < totalPages - 2)
//                    ? new int[]{pageNumber + 1} : new int[]{};
//
//            numbers = joinArray(head, numBefore,
//                    ((pageNumber > 2 && pageNumber < totalPages - 1) ? new int[]{pageNumber} : new int[]{}),
//                    numAfter, tail);
//        } else {
//            numbers = IntStream.range(1, products.getTotalPages() + 1).toArray();
//        }
//        return numbers;
//    }
//
//    static int[] joinArray(int[]... arrays) {
//        int length = 0;
//        for (int[] array : arrays) {
//            length += array.length;
//        }
//        final int[] result = new int[length];
//        int offset = 0;
//        for (int[] array : arrays) {
//            System.arraycopy(array, 0, result, offset, array.length);
//            offset += array.length;
//        }
//        return result;
//    }


}
