/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.bootstrap;

import com.house9ja.housenaija.model.Role;
import com.house9ja.housenaija.model.User;
import com.house9ja.housenaija.service.RoleService;
import com.house9ja.housenaija.service.UserService;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
@Component
public class House9JaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    UserService userService;
    RoleService roleService;
    //private Logger log = Logger.getLogger(House9JaBootstrap.class);

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadUsers();
        loadRoles();
        assignUserToAdminRole();
    }

//Add other data to seed to database from here
    //Add the super admin user
    private void loadUsers() {
        User adminUser = new User();
        adminUser.setUsername("webadmin");
        adminUser.setPassword("332House9Ja$");
        userService.createUser(adminUser);
    }

    //Add super admin role
    private void loadRoles() {
        Role adminRole = new Role();
        adminRole.setRole("ADMIN");
        roleService.createRole(adminRole);
        //log.info("Saved role" + adminRole.getRole());
    }

    //Assign the admin role to the super admin user
    private void assignUserToAdminRole() {
        List<Role> roles = (List<Role>) roleService.listAllRoles();
        List<User> users = (List<User>) userService.listAllUsers();

        roles.forEach(role -> {
            if (role.getRole().equalsIgnoreCase("ADMIN")) {
                users.forEach(user -> {
                    if (user.getUsername().equals("admin")) {
                        user.addRole(role);
                        userService.createUser(user);
                    }
                });
            }
        });
    }

}
