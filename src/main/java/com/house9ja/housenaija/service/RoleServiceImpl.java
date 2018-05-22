/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.service;

import com.house9ja.housenaija.model.Role;
import com.house9ja.housenaija.repository.RoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
@Service
public class RoleServiceImpl implements RoleService {
    
    private RoleRepository roleRepository;
    
    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    
    @Override
    public Role createRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }
    
    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public List<Role> listAllRoles() {
        return roleRepository.findAll();
    }
    
}
