package io.mycorporation.ppmtoobackend.services;

import io.mycorporation.ppmtoobackend.domain.Project;
import io.mycorporation.ppmtoobackend.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){
        return projectRepository.save(project);
    }
}

