package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.repository.DealRepository;
import am.gitc.shopping.services.DealServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealServicesImpl implements DealServices {

    private final DealRepository repository;

    public DealServicesImpl(DealRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DealEntity> getAllDeals() {
        return repository.findAll();
    }
}
