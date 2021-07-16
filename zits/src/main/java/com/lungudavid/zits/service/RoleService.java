package com.lungudavid.zits.service;

import com.lungudavid.zits.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public Role getRoleById(Long roleId);
    public List<Role> getAllRoles();
}

