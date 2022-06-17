package com.loicjacques.mongolfius.repository;

import com.loicjacques.mongolfius.models.entity.Balloon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalloonRepository extends JpaRepository<Balloon, Long> {
}
