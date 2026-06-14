package org.car.controller.Auth;

import lombok.RequiredArgsConstructor;
import org.car.dto.Auth.RegisterDTO;
import org.car.service.impl.RegisterServiceImpl;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/Update")
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

    @PutMapping("{id}/toggle-status")
    public ResponseEntity<String> toggleStatus(@PathVariable Long id) {
        boolean isActive=registerService.isCustomerActive(id);
        String message=isActive ? "Customer with ID "+id+" has been deactivated." : "Customer with ID "+id+" has been activated.";
        return ResponseEntity.ok(message);
    }
    @PutMapping("{id}/activate")
    public ResponseEntity<String> activate(@PathVariable Long id) {
        registerService.setStatus(id,true);
        return ResponseEntity.ok("Customer with ID "+id+" has been activated.");
    }
}
