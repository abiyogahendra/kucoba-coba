package mii.kucoba;

import lombok.Builder;
import mii.kucoba.models.Employee;
import mii.kucoba.repository.EmployeeRepository;
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
    private EmployeeService service;
    
    @Test
    void dumyDataEmployee(){
        Employee employee = Employee.builder()
            .name("Abiyoga")
            .email("abiyoga@hendra")
            .address("jalan kenanga")
            .last_name("wijaya")
            .build();
        
//        employeeRepository.save(employee);
        service.insertDataEmployee(employee);
    }

}
