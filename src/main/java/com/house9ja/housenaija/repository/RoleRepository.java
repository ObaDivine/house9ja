/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.repository;

import com.house9ja.housenaija.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
