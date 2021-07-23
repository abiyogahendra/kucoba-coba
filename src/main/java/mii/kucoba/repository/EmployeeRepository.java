/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.repository;

import java.util.List;
import mii.kucoba.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author abiyo
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
   
}
