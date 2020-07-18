package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.repository.ProductRepository;
import am.gitc.shopping.services.ProductServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public Page<ProductEntity> findByTitle(String title, Pageable pageable) {
        return this.repository.findByTitle(title,pageable);
    }

    @Override
    public Page<ProductEntity> getAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }


}
