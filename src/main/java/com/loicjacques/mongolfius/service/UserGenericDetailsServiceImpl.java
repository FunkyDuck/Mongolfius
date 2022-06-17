package com.loicjacques.mongolfius.service;

import com.loicjacques.mongolfius.models.entity.UserGeneric;
import com.loicjacques.mongolfius.repository.UserGenericRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserGenericDetailsServiceImpl implements UserDetailsService {
    private final UserGenericRepository userGenericRepository;

    public UserGenericDetailsServiceImpl(UserGenericRepository userGenericRepository){
        this.userGenericRepository = userGenericRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserGeneric usx = userGenericRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Personne non trouvée..."));
        log.warn(">>> TEST CNX");
//        log.info(usx.getPassword());
        return userGenericRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Personne non trouvée..."));
    }
}
