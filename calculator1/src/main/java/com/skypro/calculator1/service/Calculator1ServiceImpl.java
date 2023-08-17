package com.skypro.calculator1.service;

import org.springframework.stereotype.Service;

@Service

public class Calculator1ServiceImpl implements Calculator1Service {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String sum(int num1, int num2){
        int addition = num1 + num2;
        return num1 + " + " + num2 + " = " + addition;
    }
    @Override
    public String minus(int num1, int num2){
        int subtraction = num1 - num2;
        return num1 + " - " + num2 + " = " + subtraction;
    }
    @Override
    public String multiply(int num1, int num2){
        int multiplication = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplication;
    }
    @Override
    public String divide(int num1, int num2){
        double division = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + division;
    }
}
