package com.example.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    Scanner input = new Scanner(System.in);

    public Calculator(){
    }

    public void Addition(double firstNumber, double secondNumber) {
        double results = firstNumber + secondNumber;
        System.out.println("Addition answer is: " + results);
    }

    public void Multiplication(double firstNumber, double secondNumber) {
       double results = firstNumber * secondNumber;
        System.out.println("Multiplication answer is: " + results);

    }

    public void Division(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Cannot be divided by 0");
        }
        else {
            double results = firstNumber / secondNumber;
            DecimalFormat threeDecimalForm = new DecimalFormat("#.000");
            System.out.println("Division answer is: " + threeDecimalForm.format(results));
        }
    }
}