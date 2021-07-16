package com.lungudavid.zits.controller.datatransferobject;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRegistrationDto {
    private String fName;
    private String lName;
    private String username;
    private String password;
    private int age;
    private String email;
}
