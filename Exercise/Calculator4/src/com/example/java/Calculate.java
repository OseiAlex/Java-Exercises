package com.example.java;

public class Calculate {

    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        calculate.setFirstNumber(22);
        calculate.setSecondNumber(7);
        calculate.Addition();
        calculate.Multiplication();
        calculate.Division();
    }
}
