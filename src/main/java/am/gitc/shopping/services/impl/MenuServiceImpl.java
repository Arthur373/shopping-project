package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.repository.MenuRepository;
import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuServices {

    private final MenuRepository repository;

    public MenuServiceImpl(MenuRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<MenuEntity> getMenuByParentId(int parentId) {
        return this.repository.findByParentId(parentId);
    }

    @Override
    public List<MenuEntity> getAllMenu() {
        return this.repository.findAll();
    }

}
