/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.service;

import java.util.List;
import mii.kucoba.models.Department;
import mii.kucoba.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author abiyo
 */
@Service
public class DepartmentService {
    
    private DepartmentRepository departmentRepository;
    
    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    
    public Department getDepartmentById(Integer id){
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Tidak Ditemukan"));
        
    }
    
    public Department createDepartment(Department data){
        
        if(data.getId() != null){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Tidak Boleh Memasukkan ID");
        }
        
        return departmentRepository.save(data);       
        
    }
}
