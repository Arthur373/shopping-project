package am.gitc.shopping.services;

import am.gitc.shopping.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    UserEntity getUserByEmail(String email);

    void saveUser(UserEntity user);
}
