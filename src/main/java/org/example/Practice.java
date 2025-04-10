package org.example;

import java.util.Scanner;

public class Practice {
    static void practice1() {
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + "번째 반복");
        }

        for(int i = 5; i >= 1; i--) {
            System.out.println(i + "번 말할거야");
        }
    }
    static void practice2() {
        int result = 0;

        for(int i = 0; i <= 100; i++) {
            result += i;
        }

        System.out.println(result);
    }
    static void practice3() {
        int result = 0;

        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        System.out.println(result);
    }
    static void practice4() {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 2; j++) {
                System.out.println(i + "번째 외부 for문에서 " + j + "번째 내부 for문");
            }
        }
    }
    static void practice5() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "X" + j + "=" + (i * j) + ", ");
            }
            System.out.println();
        }
    }
    static void practice6() {
        while (true) {
            System.out.println("Hello World!");
        }
    }
    static void practice7() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("숫자를 입력하세요 (0 입력 시 종료)");

            int a = sc.nextInt();
            if (a == 0) {
                System.out.println("0을 입력해서 while문 종료");
                break;
            }

            System.out.println(a + "를 입력하셨습니다. while문 계속");
        }
    }
    public static void main(String[] args) {
//        practice1();
//        practice2();
//        practice3();
//        practice4();
//        practice5();
//        practice6();
        practice7();
    }
}
