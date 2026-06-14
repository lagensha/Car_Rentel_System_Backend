package org.car.service;

import org.car.dto.Auth.RegisterDTO;

import java.util.List;

public interface RegisterService {
    void addCustomer(RegisterDTO registerDTO);
    void updateCustomer(RegisterDTO registerDTO);
    void deleteCustomer(Long id);
    boolean isCustomerActive(Long id);
    RegisterDTO searchByID(Long id);
    List<RegisterDTO> getAll();
   boolean setStatus(Long id, boolean status);
}
