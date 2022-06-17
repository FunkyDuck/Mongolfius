package com.loicjacques.mongolfius.repository;

import com.loicjacques.mongolfius.models.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
