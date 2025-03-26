package com.example;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {

        super(message);//calling the constructor of parent class
    }
}