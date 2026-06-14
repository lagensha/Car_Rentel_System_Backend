package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.entity.Auth.RegisterEntity;
import org.car.repository.RegisterRepository;
import org.car.service.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

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
        RegisterEntity registerEntity = registerRepository.findById(id).orElse(null);
        boolean newStatus=!registerEntity.active;
        registerEntity.setActive(newStatus);
        registerRepository.save(registerEntity);
        return newStatus;
    }
    @Override
    public boolean setStatus(Long id, boolean status) {
       RegisterEntity registerEntity = registerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer not found"+id));
         registerEntity.setActive(status);
            registerRepository.save(registerEntity);
            return registerEntity.active;
    }
    @Override
    public RegisterDTO searchByID(Long id) {
        return null;
    }

    @Override
    public List<RegisterDTO> getAll() {
        return List.of();
    }
}
