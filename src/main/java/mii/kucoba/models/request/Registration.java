/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author abiyo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Registration {
    
    private String name;
    private String email;
    private String lastname;
    private String address;
    private Integer department_id;
    private String username;
    private String password;
    
}
