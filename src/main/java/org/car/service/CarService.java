package org.car.service;

import org.car.dto.Auth.RegisterDTO;

import java.util.List;

public interface CarService {
    void addCar(RegisterDTO registerDTO);
    void updateCar(RegisterDTO registerDTO);
    void deleteCar(Long id);
    boolean isCarAvailable(Long id);
    RegisterDTO searchByID(Long id);
    List<RegisterDTO> getAll();
    boolean setStatus(Long id, boolean status);
}
