package com.test.projectmanager.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/projects")
    public String getProjects() {
        return "Showing all the projects";
    }

    @GetMapping("/projects/{id}")
    public String getProject(@PathVariable Long id) {
        return "showing the project with id: " + id;
    }

    @PostMapping("/projects")
    public String createProject() {
        return "Creating Project";
    }

    @DeleteMapping("/projects/{id}")
    public String deleteProject(@PathVariable Long id) {
        return "Deleting the project: " + id;
    }

    @PutMapping("/project/{id}")
    public String updateProject(@PathVariable Long id) {
        return "Updating the project: " + id;
    }
}
