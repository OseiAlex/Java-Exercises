package com.example.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        DecimalFormat threeDP = new DecimalFormat("#.000");
        int Number1;
        int Number2;
        String operation;
        System.out.print("Enter Number 1: ");
        Number1 = Input.nextInt();
        System.out.print("Enter Number 2: ");
        Number2 = Input.nextInt();
        System.out.print("Choose an operation(+ - /):");
        operation = Input.next();

        float result;

        try {
            switch (operation){
                case "+":
                    result = addValues(Number1,Number2);
                    break;
                case "-":
                    result = subtractValues(Number1,Number2);
                    break;
                case "/":
                    result = divideValues(Number1,Number2);
                    break;
                default:
                    System.out.println("Unrecognized operation");
                    return;
            }
            System.out.println("The Answer is: " + threeDP.format(result));

        }catch (Exception e) {
            System.out.println("Number formatting exception" + e.getMessage());
        }




    }
    private static float addValues(int Number1,int Number2){
        float d1 = Math.nextDown(Number1);
        float d2 = Math.nextDown(Number2);
        return d1 + d2;


    }
    private static float subtractValues(int Number1,int Number2) {
        float d1 = Math.nextDown(Number1);
        float d2 = Math.nextDown(Number2);
        return d1 - d2;

    }
    private static float divideValues(int Number1,int Number2) {
        float d1;
        d1 = Math.nextDown(Number1);
        float d2 = Math.nextDown(Number2);
        return (d1 / d2);

    }

}
