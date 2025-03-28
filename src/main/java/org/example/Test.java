package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        divide(sc);
        sc.close();
    }
     static void divide(Scanner sc) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         double result = (double) a / b;
        System.out.println(a + " / " + b + " = " + result);
     }
}
