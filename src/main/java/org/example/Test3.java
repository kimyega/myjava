package org.example;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        toLowerTrim(sc);
        sc.close();
    }
    static void toLowerTrim(Scanner sc) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = (a + b).toLowerCase().replaceAll(" ", "");
        System.out.println(result);
    }
}
