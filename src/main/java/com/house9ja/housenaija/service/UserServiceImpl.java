/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.service;
import com.house9ja.housenaija.model.User;

import com.house9ja.housenaija.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Brian Okon - okon.brnian@gmail.com
 */
@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private EncryptionService encryptionService;
    
    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @Autowired
    public void setEncryptionService(EncryptionService encryptionService){
        this.encryptionService = encryptionService;
    }

    @Override
    public User createUser(User user) {
       return userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}
