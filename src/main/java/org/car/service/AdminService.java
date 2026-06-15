package org.car.service;

import org.car.dto.AdminDTO;

import java.awt.image.VolatileImage;

public interface AdminService {
        void login(AdminDTO adminDTO);
        void logout(Long id);
        boolean isAdminActive(Long id);
}
