package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String getCalculator(int nbr1, int nbr2) {
        return nbr1 + " + " + nbr2 + " = " + (nbr1 + nbr2);
    }
}
