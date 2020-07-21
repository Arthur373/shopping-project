package am.gitc.shopping.repository;

import am.gitc.shopping.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

    MenuEntity findByName(String name);

}
