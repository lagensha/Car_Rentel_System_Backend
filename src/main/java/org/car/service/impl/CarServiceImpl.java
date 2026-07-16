package org.car.service.impl;

import org.car.dto.Auth.RegisterDTO;
import org.car.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public void addCar(RegisterDTO registerDTO) {

    }

    @Override
    public void updateCar(RegisterDTO registerDTO) {

    }

    @Override
    public void deleteCar(Long id) {

    }

    @Override
    public boolean isCarAvailable(Long id) {
        return false;
    }

    @Override
    public RegisterDTO searchByID(Long id) {
        return null;
    }

    @Override
    public List<RegisterDTO> getAll() {
        return List.of();
    }

    @Override
    public boolean setStatus(Long id, boolean status) {
        return false;
    }
}
