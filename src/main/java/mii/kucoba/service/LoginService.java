/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.service;

import mii.kucoba.Detail.AppUserDetail;
import mii.kucoba.Detail.AppUserDetailService;
import mii.kucoba.models.User;
import mii.kucoba.models.request.Authorization;
import mii.kucoba.models.request.Login;
import mii.kucoba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author abiyo
 */
@Service
public class LoginService {
    
    private AppUserDetailService appUserDetailService;
    
    private UserRepository userRepository;
    
    private PasswordEncoder passwordEncoder; 

    @Autowired
    public LoginService(AppUserDetailService appUserDetailService, UserRepository userRepository) {
        this.appUserDetailService = appUserDetailService;
        this.userRepository = userRepository;
    }
    
    
    
    public Authorization prosesLogin(Login l){
        
        Authorization authorization = new Authorization();
        
        User user = new User();
        
        user = userRepository.findByUsername(l.getUsername());
        
        if(user == null){
            throw new UsernameNotFoundException("Username tidak di temukan");
        }
        
        boolean pass = pas
        
        
       
    }
}
