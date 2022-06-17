package com.loicjacques.mongolfius.service;

import com.loicjacques.mongolfius.repository.UserGenericRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserGenericService {
    private final UserGenericRepository repository;
    private final PasswordEncoder encoder;

    public UserGenericService(UserGenericRepository repository, PasswordEncoder encoder){
        this.repository = repository;
        this.encoder = encoder;
    }


}
