package am.gitc.shopping.services.impl;

import am.gitc.shopping.entity.RoleEntity;
import am.gitc.shopping.entity.UserEntity;
import am.gitc.shopping.repository.RoleRepository;
import am.gitc.shopping.repository.UserRepository;
import am.gitc.shopping.services.UserServices;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServicesImpl(UserRepository userRepository, RoleRepository roleRepository,
                            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(UserEntity user) {
        user.setActive(1);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (roleRepository.findByRole("ROLE_USER") == null) {
            user.setRoles(Collections.singleton(new RoleEntity("ROLE_USER")));
        } else {
            user.setRoles(Collections.singleton(roleRepository.findByRole("ROLE_USER")));
        }
        this.userRepository.save(user);
    }

    public void update(UserEntity user) {
        this.userRepository.save(user);
    }
}
