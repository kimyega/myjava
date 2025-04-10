package org.example;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPrint(n);
        sc.close();
    }
    static void starPrint(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = i; j < 2 * n - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
