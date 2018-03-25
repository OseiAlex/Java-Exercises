package com.company;

public class Main {
    //Demonstrate
    public static void main(String[] args) {
        int i,k;
        i =10;
        k = i < 0 ? -i : i; //get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i; //get absolute of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
