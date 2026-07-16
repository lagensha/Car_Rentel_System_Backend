package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
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
