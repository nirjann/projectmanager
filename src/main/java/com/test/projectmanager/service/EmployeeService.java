package com.test.projectmanager.service;

import java.util.List;

import com.test.projectmanager.entity.Employee;
import com.test.projectmanager.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        employee.setEmployeeId(id);
        return employeeRepository.save(employee);
    }
}
