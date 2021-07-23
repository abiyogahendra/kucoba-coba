/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.controller;

import java.util.List;
import mii.kucoba.models.Employee;
import mii.kucoba.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abiyo
 */

//localhost:port/emp

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    
    private EmployeeService employeeService;
    
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping
    public ResponseEntity<List<Employee>> getAllDataEmployee(){
        return new ResponseEntity(employeeService.getAllEmployee(), HttpStatus.OK);
    }
            
    @PostMapping
    public ResponseEntity<Employee> createDataEmployee(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.insertDataEmployee(employee), HttpStatus.OK);
    }
    
}

