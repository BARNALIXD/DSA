package com.kunal;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap the two numbers
        int temp = a;
        a = b;
        b = temp;

        // Print the swapped values
        System.out.println("a: " + a + ", b: " + b);
    }
}
