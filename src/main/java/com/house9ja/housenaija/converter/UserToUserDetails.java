/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.converter;

import com.house9ja.housenaija.service.UserDetailsImpl;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.house9ja.housenaija.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
@Component
public class UserToUserDetails implements Converter<User, UserDetails>{
    //This class converts User model to UserDetails which is required by the UserDetails interface of Spring
    
    @Override
    public UserDetails convert(User user) {
        UserDetailsImpl userDetails = new UserDetailsImpl();
 
        if (user != null) {
            userDetails.setUsername(user.getUsername());
            userDetails.setPassword(user.getEncryptedPassword());
            userDetails.setEnabled(user.getEnabled());
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            user.getRoles().forEach(role -> {
                authorities.add(new SimpleGrantedAuthority(role.getRole()));
            });
            userDetails.setAuthorities(authorities);
        }
 
        return userDetails;
    }
}
