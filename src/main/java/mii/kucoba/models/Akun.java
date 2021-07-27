/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author abiyo
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "akun")
public class Akun {
    
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "username")
    private String name;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "role")
    private String role;
    
    
    
}
