/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.controller;

import mii.kucoba.Detail.AppUserDetailService;
import mii.kucoba.config.ResponseMassage;
import mii.kucoba.models.Role;
import mii.kucoba.models.User;
import mii.kucoba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abiyo
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private AppUserDetailService appUserDetailService;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.appUserDetailService = appUserDetailService;
    }
    
    @PostMapping
    public ResponseEntity<String> createDataUser(@RequestBody User r, Authentication auth){
        System.out.println(auth.getAuthorities().toString());
        return new ResponseEntity(appUserDetailService.createAkunEmployee(r), HttpStatus.OK);
    }
    
    
    
}
