package org.car.repository;

import org.car.entity.Auth.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<RegisterEntity, String> {
}
