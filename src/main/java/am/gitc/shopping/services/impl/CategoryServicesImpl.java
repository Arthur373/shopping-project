package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.CategoryEntity;
import am.gitc.shopping.repository.CategoryRepository;
import am.gitc.shopping.services.CategoryServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicesImpl implements CategoryServices {

    private final CategoryRepository repository;

    public CategoryServicesImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public CategoryEntity getBySlug(String slug) {
        return this.repository.findBySlug(slug);
    }

    @Override
    public List<CategoryEntity> getAllCategories() {
        return this.repository.findAll();
    }
}
