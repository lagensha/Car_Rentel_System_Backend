package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.entity.Auth.RegisterEntity;
import org.car.repository.RegisterRepository;
import org.car.service.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegisterServiceImpl implements RegisterService {
    final RegisterRepository registerRepository;
    final ModelMapper modelMapper;

    @Override
    public void addCustomer(RegisterDTO registerDTO) {
        RegisterEntity registerEntity =modelMapper.map(registerDTO,RegisterEntity.class);
        registerRepository.save(registerEntity);
    }

    @Override
    public void updateCustomer(RegisterDTO registerDTO) {
        RegisterEntity registerEntity=modelMapper.map(registerDTO,RegisterEntity.class);
        registerRepository.save(registerEntity);
    }

    @Override
    public void deleteCustomer(Long id) {
        registerRepository.deleteById(id);
    }

    @Override
    public boolean isCustomerActive(Long id) {
        return false;
    }
}
