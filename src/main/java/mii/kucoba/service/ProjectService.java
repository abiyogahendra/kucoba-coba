/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.kucoba.service;

import java.util.List;
import mii.kucoba.models.Project;
import mii.kucoba.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author abiyo
 */
@Service
public class ProjectService {
    
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
    
    
//    public List<Project> getProjectByLocation(String location){
//        return projectRepository.getProjectByLocation(location);
//    }
    
    public Project createProjectData(Project project){
        if (project.getId() != null) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "Project Id Tidak Boleh Diisikan");
        }
        return projectRepository.save(project);
    }
    
    
}
