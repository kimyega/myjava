package org.example;

import java.util.Scanner;

public class MainTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {   // 더 이상 읽을 값이 없으면 false 반환
      String input = sc.nextLine();
      System.out.println("입력: " + input);
    }

    sc.close();
  }
}
