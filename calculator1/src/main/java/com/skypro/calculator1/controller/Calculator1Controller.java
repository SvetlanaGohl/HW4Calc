package com.skypro.calculator1.controller;

import com.skypro.calculator1.service.Calculator1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class Calculator1Controller {
    private final Calculator1Service calculator1Service;

    public Calculator1Controller(Calculator1Service calculator1Service) {
        this.calculator1Service = calculator1Service;
    }

    @GetMapping
    public String welcome(){
        return calculator1Service.welcome();
    }
    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2){
        return calculator1Service.sum(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculator1Service.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return calculator1Service.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if(num2 == 0){
            return " ОШИБКА! Внимание!!! Деление на 0 не допускается!";
        }
        return calculator1Service.divide(num1, num2);
    }
}

