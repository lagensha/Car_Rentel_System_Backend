package org.car.service.impl;

import lombok.RequiredArgsConstructor;
import org.car.dto.CarDTO;
import org.car.entity.CarEntity;
import org.car.repository.CarRepository;
import org.car.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    final  CarRepository carRepository;
    final ModelMapper modelMapper;

    @Override
    public void addCar(CarDTO carDTO) {
        CarEntity carEntity=modelMapper.map(carDTO,CarEntity.class);
        carRepository.save(carEntity);
    }

    @Override
    public void updateCar(CarDTO carDTO) {

    }

    @Override
    public void deleteCar(Long id) {

    }

    @Override
    public boolean isCarAvailable(Long id) {
        return false;
    }

    @Override
    public CarDTO searchByID(Long id) {
        return null;
    }

    @Override
    public List<CarDTO> getAll() {
        return List.of();
    }

    @Override
    public boolean setStatus(Long id, boolean status) {
        return false;
    }
}
