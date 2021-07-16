package com.lungudavid.zits.service.implementation;

import com.lungudavid.zits.model.Role;
import com.lungudavid.zits.repository.RoleRepository;
import com.lungudavid.zits.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    //creating the role repository instance
    @Autowired
    private RoleRepository roleRepository;

    public Role getRoleById(Long roleId) {
        return roleRepository.getById(roleId);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
