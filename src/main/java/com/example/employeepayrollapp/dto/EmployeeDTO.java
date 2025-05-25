package com.example.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



// IN LOMBOK we can remove it so that it generates on its own!!! 
@Data                       // Generates getters, setters, toString(), equals(), hashCode()
@NoArgsConstructor          // Generates no-arg constructor
@AllArgsConstructor         // Generates all-args constructor
public class EmployeeDTO {
    private String name;
    private long salary;
}

