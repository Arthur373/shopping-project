package am.gitc.shopping.services;

import am.gitc.shopping.entity.MenuEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuServices {

    MenuEntity getMenuByName(String name);

    List<MenuEntity> getAllMenu();

}
