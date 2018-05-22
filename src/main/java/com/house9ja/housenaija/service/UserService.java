/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.service;

import com.house9ja.housenaija.model.User;
import java.util.List;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
public interface UserService {
    User createUser(User user);
    void deleteUser(Long id);
    User findByUsername(String username);
    List<User> listAllUsers();
}
