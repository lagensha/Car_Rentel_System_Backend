package org.car.dto.Auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String address;
    private Long phoneNumber;
    private Boolean active=true;

}
