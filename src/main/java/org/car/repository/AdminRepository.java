package org.car.repository;

import org.car.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
}
