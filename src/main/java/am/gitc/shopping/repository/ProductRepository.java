package am.gitc.shopping.repository;

import am.gitc.shopping.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findProductById(int id);

    Page<ProductEntity> findAll(Pageable pageable);
}
