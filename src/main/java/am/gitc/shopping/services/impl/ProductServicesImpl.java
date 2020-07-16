package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.repository.ProductRepository;
import am.gitc.shopping.services.ProductServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {

    private final ProductRepository repository;

    public ProductServicesImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return repository.findAll();
    }
}
