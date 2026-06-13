package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.service.RegisterService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegisterServiceImpl implements RegisterService {
    @Override
    public void addCustomer(RegisterDTO registerDTO) {

    }

    @Override
    public void updateCustomer(RegisterDTO registerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public boolean isCustomerActive(String id) {
        return false;
    }
}
