package am.gitc.shopping.services;

import am.gitc.shopping.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductServices {

    List<ProductEntity> getAllProduct();

    Page<ProductEntity> findByTitle(String title, Pageable pageable);

    Page<ProductEntity> getAll(Pageable pageable);

}
