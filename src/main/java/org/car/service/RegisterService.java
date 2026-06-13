package org.car.service;

import org.car.dto.Auth.RegisterDTO;

public interface RegisterService {
    void addCustomer(RegisterDTO registerDTO);
    void updateCustomer(RegisterDTO registerDTO);
    void deleteCustomer(String id);
    boolean isCustomerActive(String id);
}
