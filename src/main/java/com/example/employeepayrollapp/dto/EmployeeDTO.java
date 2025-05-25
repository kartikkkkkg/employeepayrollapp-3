package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO {
    
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 1000, message = "Salary must be greater than 1000")
    private long salary;
}
