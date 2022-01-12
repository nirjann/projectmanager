package com.test.projectmanager.controller;

import java.util.List;
import java.util.Optional;

import com.test.projectmanager.entity.Project;
import com.test.projectmanager.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id) {
        return projectService.getProject(id);
    }

    @PostMapping("/projects")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @DeleteMapping("/projects/{id}")
    public String deleteProject(@PathVariable Long id) {
        return "Deleting the project: " + id;
    }

    @PutMapping("/project/{id}")
    public String updateProject(@PathVariable Long id, @RequestBody Project updateDate) {
       return projectService.updateProject(id, updateData)
    }
}
