package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    public final CalculationMethods calculationMethods;

    @GetMapping
    public String answerWelcome(){
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping(path = "/plus")
    public String answerPlus(@RequestParam(name = "num1", required = false) Integer a,
                             @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null)
            return "Параметры не переданы.";
        int plus = calculationMethods.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping(path = "/minus")
    public String answerMinus(@RequestParam(name = "num1", required = false) Integer a,
                              @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null)
            return "Параметры не переданы.";
        int minus = calculationMethods.minus(a, b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping(path = "/multiply")
    public String answerMultiply(@RequestParam(name = "num1", required = false) Integer a,
                                 @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null)
            return "Параметры не переданы.";
        int multiply = calculationMethods.multiply(a, b);
        return a + " * " + b + " = " + multiply;
    }

    @GetMapping(path = "/divide")
    public String answerDivide(@RequestParam(name = "num1", required = false) Integer a,
                               @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null)
            return "Параметры не переданы.";
        double divide;
        try{
            divide = calculationMethods.divide(a, b);
        }catch (Throwable e){
            return e.getMessage();
        }
        return a + " / " + b + " = " + divide;
    }

}
