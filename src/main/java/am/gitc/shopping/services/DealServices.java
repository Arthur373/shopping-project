package am.gitc.shopping.services;

import am.gitc.shopping.entity.DealEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DealServices {

    List<DealEntity> getAllDeals();

}
