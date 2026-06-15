package org.car.service;

import org.car.dto.AdminDTO;

import java.awt.image.VolatileImage;

public interface AdminService {
        boolean login(AdminDTO adminDTO);
        boolean logout(Long id);
        boolean isAdminActive(Long id);
}
