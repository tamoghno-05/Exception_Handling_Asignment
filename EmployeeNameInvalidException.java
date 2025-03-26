package com.example;

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {

        super(message);//calling the constructor of parent class
    }
}