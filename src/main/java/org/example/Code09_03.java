package org.example;

import java.util.Scanner;

public class Code09_03 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i < numAry.length; i++) {
            System.out.print("숫자 : ");
            numAry[i] = sc.nextInt();
        }

        for (int num : numAry) {
            hap += num;
        }

        System.out.println("합계 ==> " + hap);

        sc.close();
    }
}
