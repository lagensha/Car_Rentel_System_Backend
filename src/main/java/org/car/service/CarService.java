package org.car.service;

import org.car.dto.Auth.RegisterDTO;
import org.car.dto.CarDTO;

import java.util.List;

public interface CarService {
    void addCar(CarDTO carDTO);
    void updateCar(CarDTO carDTO);
    void deleteCar(Long id);
    boolean isCarAvailable(Long id);
    CarDTO searchByID(Long id);
    List<CarDTO> getAll();
    boolean setStatus(Long id, boolean status);
}
