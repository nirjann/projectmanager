package com.test.projectmanager.service;

import java.util.List;
import java.util.Optional;

import com.test.projectmanager.entity.Project;

public interface IProjectService {
    List<Project> getAllProjects();

    Optional<Project> getProject(Long id);

    Project createProject(Project project);

    boolean deleteProject(Long id);

    Project updateProject(Long id, Project updateData);
}
