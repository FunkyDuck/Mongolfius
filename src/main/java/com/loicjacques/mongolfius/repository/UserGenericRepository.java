package com.loicjacques.mongolfius.repository;

import com.loicjacques.mongolfius.models.entity.UserGeneric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserGenericRepository extends JpaRepository<UserGeneric, Long> {
    Optional<UserGeneric> findByUsername(String username);
}
