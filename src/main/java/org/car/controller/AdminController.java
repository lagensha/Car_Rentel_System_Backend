package org.car.controller;

import lombok.RequiredArgsConstructor;
import org.car.dto.AdminDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController  {


    public void login(AdminDTO adminDTO) {

    }


    public void logout(Long id) {

    }


    public boolean isAdminActive(Long id) {
        return false;
    }
}
