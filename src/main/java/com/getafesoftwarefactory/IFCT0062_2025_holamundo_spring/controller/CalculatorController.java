package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.controller;

import com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // This annotation determines or finds which is in charge to solve a specific request
public class CalculatorController {

    @Autowired //
    CalculatorService calculatorService;
    @GetMapping("/sumar")
    public String Sumar(Model model, @RequestParam int nbr1, @RequestParam int nbr2) {
        // Ejemplo http://localhost:8080/?nombre=Elaine
        String result = calculatorService.getCalculator(nbr1, nbr2);
        model.addAttribute("texto_sumar", result);
        return "calculadora"; // return value determines the output result for the server html
    }
}
