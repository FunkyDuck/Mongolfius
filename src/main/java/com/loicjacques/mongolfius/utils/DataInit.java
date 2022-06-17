package com.loicjacques.mongolfius.utils;

import com.loicjacques.mongolfius.models.entity.Admin;
import com.loicjacques.mongolfius.repository.AdminRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataInit implements InitializingBean {
    private final AdminRepository repository;

    private final PasswordEncoder encoder;

    public DataInit(AdminRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Admin admin = new Admin();
        admin.setUsername("admin@mongolfius.be");
        admin.setFirstName("Loïc");
        admin.setLastName("Jacques");
        admin.setPassword(encoder.encode("admin"));
        admin.setRef(UUID.randomUUID());
        repository.save(admin);
    }
}
