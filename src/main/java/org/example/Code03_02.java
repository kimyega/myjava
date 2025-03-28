package org.example;

import java.util.Scanner;

public class Code03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;
        double doubleRes;

        System.out.print("첫 번째 정수 입력 ==> ");
        n1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 ==> ");
        n2 = sc.nextInt();

        res = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res);
        res = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + res);
        res = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + res);
        doubleRes = (double) n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + doubleRes);
        res = n1 % n2;
        System.out.println(n1 + " % " + n2 + " = " + res);

    }
}
