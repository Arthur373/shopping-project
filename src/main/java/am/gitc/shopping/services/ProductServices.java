package am.gitc.shopping.services;

import am.gitc.shopping.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductServices {

    List<ProductEntity> getAllProduct();

}
