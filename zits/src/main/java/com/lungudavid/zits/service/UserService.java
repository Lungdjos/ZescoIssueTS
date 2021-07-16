package com.lungudavid.zits.service;

import com.lungudavid.zits.controller.datatransferobject.UserRegistrationDto;
import com.lungudavid.zits.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
