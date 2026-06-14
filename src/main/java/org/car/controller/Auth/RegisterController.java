package org.car.controller.Auth;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.service.impl.RegisterServiceImpl;
import org.springframework.web.bind.annotation.*;

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


    public void deleteCustomer(String id) {

    }


    public boolean isCustomerActive(String id) {
        return false;
    }
}
