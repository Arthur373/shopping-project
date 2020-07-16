package am.gitc.shopping.services;

import am.gitc.shopping.entity.BannerEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BannerServices {

    List<BannerEntity> getAllBanners();

}
