package com.example.ems.service;

import com.example.ems.model.Employee;
import com.example.ems.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public List<Employee> getEmployeeByName(String firstName){
        return employeeRepo.findByFirstName(firstName);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }
}
