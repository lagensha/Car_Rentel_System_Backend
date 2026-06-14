package org.car.controller.Auth;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.service.impl.RegisterServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class RegisterController{

    final RegisterServiceImpl registerService;

    @PostMapping("/register")
    public void addCustomer(@RequestBody RegisterDTO registerDTO) {
        registerService.addCustomer(registerDTO);
    }

    @GetMapping("/Update")
    public void updateCustomer(@RequestBody RegisterDTO registerDTO) {
        registerService.updateCustomer(registerDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        registerService.deleteCustomer(id);
    }

    public boolean isCustomerActive(Long id) {
        return false;
    }

    public RegisterDTO searchByID(Long id) {
        return null;
    }


    public List<RegisterDTO> getAll() {
        return List.of();
    }
}
