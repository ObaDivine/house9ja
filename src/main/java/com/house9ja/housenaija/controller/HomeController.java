/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Brian Okon - okon.brian@gmail.com
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping(name = "/registration")
    public String registration(){
        return "registration";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
