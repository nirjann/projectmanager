package com.test.projectmanager.service;

import java.util.List;
import java.util.Optional;

import com.test.projectmanager.entity.Project;
import com.test.projectmanager.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Optional<Project> getProject(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public boolean deleteProject(Long id) {
        try {
            projectRepo.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public Project updateProject(Long id, Project updateData) {
        updateData.setProjectId(id);
        return projectRepo.save(updateData);
    }

}
