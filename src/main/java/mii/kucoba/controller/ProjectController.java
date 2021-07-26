/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.controller;

import java.util.List;
import mii.kucoba.models.Project;
import mii.kucoba.models.request.EmployeProject;
import mii.kucoba.repository.ProjectRepository;
import mii.kucoba.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abiyo
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    
    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
    
    @GetMapping
    public ResponseEntity<List<Project>> getAllDataProject(){
        return new ResponseEntity(projectService.getAllDataProject(), HttpStatus.OK);
    }
    
    @GetMapping("/{lokasi}-{name}")
    public ResponseEntity<List<Project>> getProjectByLocation(@PathVariable("lokasi") String lokasi, @PathVariable("name") String name){
        return new ResponseEntity(projectService.getProjectByLocation(lokasi,name), HttpStatus.OK);
    }
    
    @GetMapping("/join-employee")
    public ResponseEntity<List<EmployeProject>> getAllDataJoinEmployee(){
        return new ResponseEntity(projectService.getAllProjectEmployee(), HttpStatus.OK);
    }
    
}
