package com.example.employee_management;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id); // Return Optional<Employee>

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    boolean deleteEmployee(Long id);
}