package com.company;

public class Main {

    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b );

        if (b) System.out.println("This is executed.");
        b = false;
        if (b) System.out.println("");
    }
}
