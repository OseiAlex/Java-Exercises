package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //input to print Fibonacci series up to how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series up to " + number +" numbers : ");
        //printing Fibonacci series up to number
        for(int i = 1; i <= number; i ++){
            System.out.print(i +" ");
        }
    }
}
