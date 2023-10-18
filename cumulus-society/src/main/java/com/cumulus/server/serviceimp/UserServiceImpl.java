package com.cumulus.server.serviceimp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cumulus.server.repo.UserRepository;
import com.cumulus.server.serviceapi.UserService;
import com.cumulus.server.model.User;

@Service
public class UserServiceImpl implements UserService {
      @Autowired
      private PasswordEncoder passwordEn;
    @Autowired
    private UserRepository userRepository;
 
    public UserServiceImpl(){}

    @Override
    public User createUser(User user) {
        String password = passwordEn.encode(user.getPassword());
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();    
    } 
}
