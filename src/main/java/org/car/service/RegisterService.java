package org.car.service;

import org.car.dto.Auth.RegisterDTO;

public interface RegisterService {
    void addCustomer(RegisterDTO registerDTO);
    void updateCustomer(RegisterDTO registerDTO);
    void deleteCustomer(Long id);
    boolean isCustomerActive(Long id);
}
