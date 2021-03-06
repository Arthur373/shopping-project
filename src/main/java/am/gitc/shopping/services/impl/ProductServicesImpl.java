package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.CategoryEntity;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.repository.ProductRepository;
import am.gitc.shopping.services.ProductServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public ProductEntity getProductById(int id) {
        return repository.findProductById(id);
    }


    @Override
    public Page<ProductEntity> getAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public Page<ProductEntity> getProductBySlug(String slug, Pageable pageable) {
        return this.repository.findProductBySlug(slug,pageable);
    }

}
