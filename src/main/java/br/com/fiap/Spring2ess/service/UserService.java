package br.com.fiap.Spring2ess.service;

import br.com.fiap.Spring2ess.model.User;
import br.com.fiap.Spring2ess.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public User save(User user) {
        user.setPassword(
                this.passwordEncoder.encode(
                        user.getPassword()
                )
        );


        User savedUser = this.userRepository.save(user);


        savedUser.setPassword(null);


        return savedUser;
    }
}