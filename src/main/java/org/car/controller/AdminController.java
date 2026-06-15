package org.car.controller;

import lombok.RequiredArgsConstructor;
import org.car.dto.AdminDTO;
import org.car.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    final AdminService adminService;
@PostMapping("/login")
    public void login(@RequestBody AdminDTO adminDTO) {
        adminService.login(adminDTO);
    }

@DeleteMapping("/logout/{id}")
    public void logout(@PathVariable Long id) {
        adminService.logout(id);
    }
@PutMapping("/toggleStatus/{id}")
    public ResponseEntity<String>toggleAdminStatus(@PathVariable Long id){
            boolean active=adminService.isAdminActive(id);
            String status=active ? "Admin with ID "+id+" has been deactivated." : "Admin with ID "+id+" has been activated.";
            return ResponseEntity.ok(status);
    }

}
