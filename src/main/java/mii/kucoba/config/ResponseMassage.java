/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author abiyo
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseMassage <E>{
    
    private E data;
    private String message;
    
}
