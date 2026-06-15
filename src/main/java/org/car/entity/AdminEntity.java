package org.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminEntity {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isActive;
}
