package org.car.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdminEntity {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isActive;
}
