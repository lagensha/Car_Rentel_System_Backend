package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.repository.AdminRepository;
import org.car.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {
    final AdminRepository adminRepository;
    final ModelMapper modelMapper;
    @Override
    public void addCar() {

    }

    @Override
    public void updateCar() {

    }

    @Override
    public void deleteCar() {

    }

    @Override
    public void viewCar() {

    }

    @Override
    public Boolean isCarAvailable() {
        return null;
    }

    @Override
    public void viewCustomer() {

    }
}
