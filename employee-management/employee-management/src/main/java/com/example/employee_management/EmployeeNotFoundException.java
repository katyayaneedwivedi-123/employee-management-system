package com.example.employee_management;

public class EmployeeNotFoundException extends RuntimeException {

    // Constructor to pass the error message to the parent RuntimeException class
    public EmployeeNotFoundException(String message) {
        super(message);  // Call the constructor of RuntimeException with the message
    }
}