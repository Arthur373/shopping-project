package am.gitc.shopping.repository;

import am.gitc.shopping.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

    List<MenuEntity> findByParentId(int parentId);

}
