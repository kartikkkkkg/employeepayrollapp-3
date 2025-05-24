package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee createEmployee(EmployeeDTO employeeDTO);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, EmployeeDTO employeeDTO);
    void deleteEmployee(int id);
}
