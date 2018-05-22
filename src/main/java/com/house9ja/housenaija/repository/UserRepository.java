/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.repository;

import com.house9ja.housenaija.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
    //User findByEmail(String email);
    //User findByPhoneNumber(String phoneNumber);
   // User findBySurname(String surname);
    //User findByOtherNames(String otherNames);
}
