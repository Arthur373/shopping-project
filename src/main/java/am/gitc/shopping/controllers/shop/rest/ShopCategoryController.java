package am.gitc.shopping.controllers.shop.rest;

import am.gitc.shopping.dto.ProductDto;
import am.gitc.shopping.entity.CategoryEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.mapper.ProductMapper;
import am.gitc.shopping.services.CategoryServices;
import am.gitc.shopping.services.ProductServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class ShopCategoryController {

    private final CategoryServices categoryServices;
    private final ProductMapper productMapper;
    private final ProductServices productServices;

    public ShopCategoryController(CategoryServices categoryServices, ProductMapper productMapper, ProductServices productServices) {
        this.categoryServices = categoryServices;
        this.productMapper = productMapper;
        this.productServices = productServices;
    }

//    @RequestParam("slug") String slug
//    @PostMapping("/shopCategory")
//    public ResponseEntity<List<ProductDto>> getShop(HttpServletRequest request) {
//        String slug = request.getParameter("slug");
//        CategoryEntity category = this.categoryServices.getBySlug(slug);
//
//        List<ProductEntity> products = null;
//        if(!category.getProducts().isEmpty()){
//            products = category.getProducts();
//        }
//
//        return ResponseEntity.ok(this.productMapper.toDtoList(products));
//    }

}
