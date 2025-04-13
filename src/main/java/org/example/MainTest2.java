package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainTest2 {
  public static void main(String[] args) {
    BigDecimal num2 = new BigDecimal("2.4");
    System.out.println(num2.setScale(2, RoundingMode.HALF_UP)); // 출력: 2.46
  }
}
