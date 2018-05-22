/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.service;

import com.house9ja.housenaija.model.Role;
import java.util.List;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
public interface RoleService {
    Role createRole(Role role);
    void deleteRole(Long id);
    List<Role> listAllRoles();
}
