package com.loicjacques.mongolfius.repository;

import com.loicjacques.mongolfius.models.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
