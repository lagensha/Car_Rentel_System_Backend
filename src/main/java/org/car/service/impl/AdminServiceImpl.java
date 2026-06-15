package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.AdminDTO;
import org.car.repository.AdminRepository;
import org.car.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {
    final AdminRepository adminRepository;
    final ModelMapper modelMapper;

    @Override
    public boolean login(AdminDTO adminDTO) {
        return false;
    }

    @Override
    public boolean logout(Long id) {
        return false;
    }

    @Override
    public boolean isAdminActive(Long id) {
        return false;
    }
}
