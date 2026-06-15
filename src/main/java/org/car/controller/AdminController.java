package org.car.controller;

import lombok.RequiredArgsConstructor;
import org.car.dto.AdminDTO;
import org.car.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    final AdminService adminService;
@PostMapping("/login")
    public void login(AdminDTO adminDTO) {
        adminService.login(adminDTO);
    }

@DeleteMapping("/logout/{id}")
    public void logout(Long id) {
        adminService.logout(id);
    }

    public ResponseEntity<String>toggleAdminStatus(Long id){
            boolean active=adminService.isAdminActive(id);
            String status=active ? "Admin with ID "+id+" has been deactivated." : "Admin with ID "+id+" has been activated.";
            return ResponseEntity.ok(status);
    }

}
