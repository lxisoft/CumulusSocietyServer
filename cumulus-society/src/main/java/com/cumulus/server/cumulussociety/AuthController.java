package com.cumulus.server.cumulussociety;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cumulus.server.model.User;
import com.cumulus.server.serviceapi.UserService;

@RestController
@RequestMapping("/cumulus")
public class AuthController {

    @Autowired
     private UserService userService;
    // build create User REST API
    @PostMapping("/signup")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("/secure/hello")
    public String secureHello() {
        return "Secure Hello!";
    }
}
