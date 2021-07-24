package mii.kucoba;

import lombok.Builder;
import mii.kucoba.models.Department;
import mii.kucoba.models.Employee;
import mii.kucoba.repository.EmployeeRepository;
import mii.kucoba.service.DepartmentService;
import mii.kucoba.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KucobaSpringApplicationTests {

//	@Test
//	void contextLoads() {
//	}
    
//    @Autowired
//    EmployeeRepository employeeRepository;
    
    @Autowired
    private DepartmentService departmentService;
    
    @Autowired
    private EmployeeService service;
    
    @Test
    void dumyDataDepartment(){
        Department department = Department.builder()
                .name("Kesehatan")
                .build();
        
        departmentService.createDepartment(department);
        
        Employee employee = Employee.builder()
            .name("Abiyoga")
            .email("abiyoga@hendra")
            .address("jalan kenanga")
            .last_name("wijaya")
            .department(department)
            .build();
        
        service.insertDataEmployee(employee);

    }
    
    
    
//    @Test
//    void dumyDataEmployee(){
//        
//        Department department = Department.builder()
//                .id(1)
//                .build();
//        
//    }
  
}
