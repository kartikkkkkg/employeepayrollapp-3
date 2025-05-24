package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService implements IEmployeeService {

    private List<Employee> employeeList = new ArrayList<>();
    private int counter = 1;

    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee emp = new Employee(counter++, employeeDTO.getName(), employeeDTO.getSalary());
        employeeList.add(emp);
        return emp;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO employeeDTO) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(employeeDTO.getName());
            emp.setSalary(employeeDTO.getSalary());
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
    }
}
