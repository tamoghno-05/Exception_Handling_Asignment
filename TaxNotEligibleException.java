package com.example;

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {

        super(message);//calling the constructor of parent class
    }
}