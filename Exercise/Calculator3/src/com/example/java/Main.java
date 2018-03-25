package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();


        calculate.Addition(firstNumber,secondNumber);
        calculate.Multiplication(firstNumber,secondNumber);
        calculate.Division(firstNumber,secondNumber);
    }
}
