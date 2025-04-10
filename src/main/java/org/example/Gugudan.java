package org.example;

public class Gugudan {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (i == 0) {
                    System.out.printf(String.format("%7s%4s", j + " 단", " ".repeat(3)));
                } else {
                    System.out.print(String.format("%2d%2s%2d%2s%3d ", j, "*", i, "=", i * j));
                }
            }
            System.out.println();
        }
    }
}
