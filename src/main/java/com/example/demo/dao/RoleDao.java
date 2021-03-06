package com.example.demo.dao;

import com.example.demo.models.Role;

import java.util.List;

public interface RoleDao {
    Role findByRoleName(String name);

    List<Role> getAllRoles();
}
