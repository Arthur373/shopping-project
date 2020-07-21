package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.MenuEntity;
import am.gitc.shopping.repository.MenuRepository;
import am.gitc.shopping.services.MenuServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuServices {

    private final MenuRepository repository;

    public MenuServiceImpl(MenuRepository repository) {
        this.repository = repository;
    }

    @Override
    public MenuEntity getMenuByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<MenuEntity> getAllMenu() {
        return this.repository.findAll();
    }

}
