package am.gitc.shopping.repository;

import am.gitc.shopping.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findProductById(int id);

    Page<ProductEntity> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM products  p inner join product_category  pc on pc.product_id = p.id inner join categories  c on c.id = pc.category_id where slug = ?1",
            nativeQuery = true)
    Page<ProductEntity> findProductBySlug(@Param("slug") String slug, Pageable pageable);


}
