package am.gitc.shopping.services;

import am.gitc.shopping.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryServices {

    CategoryEntity getBySlug(String slug);

    List<CategoryEntity> getAllCategories();
}
