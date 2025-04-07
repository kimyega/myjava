package org.example;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = i; j < 2 * n; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
