package am.gitc.shopping.services;

import am.gitc.shopping.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductServices {

    List<ProductEntity> getAllProduct();

    ProductEntity getProductById(int id);

    Page<ProductEntity> getAll(Pageable pageable);

    Page<ProductEntity> getProductBySlug(String slug, Pageable pageable);

}
