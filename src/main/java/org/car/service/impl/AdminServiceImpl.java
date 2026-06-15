package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.AdminDTO;
import org.car.entity.AdminEntity;
import org.car.entity.Auth.RegisterEntity;
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
    public void login(AdminDTO adminDTO) {
        AdminEntity adminEntity =modelMapper.map(adminDTO,AdminEntity.class);
        adminRepository.save(adminEntity);
    }

    @Override
    public void logout(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public boolean isAdminActive(Long id) {
      AdminEntity adminEntity = adminRepository.findById(id).orElseThrow(()->new RuntimeException("Admin not found"));
      adminEntity.setActive(true);
        adminRepository.save(adminEntity);
        return adminEntity.isActive();
    }
    @Override
  public boolean setAdminStatus(Long id, boolean status){
     AdminEntity adminEntity = adminRepository.findById(id).orElseThrow(()->new RuntimeException(id+"Admin not found"));
      adminEntity.setActive(status);
        adminRepository.save(adminEntity);
        return adminEntity.isActive();
  }

}
