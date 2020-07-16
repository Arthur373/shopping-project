package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.BannerEntity;
import am.gitc.shopping.entity.DealEntity;
import am.gitc.shopping.repository.BannerRepository;
import am.gitc.shopping.repository.DealRepository;
import am.gitc.shopping.services.BannerServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServicesImpl implements BannerServices {

    private final BannerRepository repository;

    public BannerServicesImpl(BannerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BannerEntity> getAllBanners() {
        return  repository.findAll();
    }
}
