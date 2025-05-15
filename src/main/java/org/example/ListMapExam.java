package org.example;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ListMapExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Map<String, String>> list = IntStream.range(0, 3)
                .mapToObj(i -> {
                    Map<String, String> map = new LinkedHashMap<>();

                    System.out.print("이름 : ");
                    String name = sc.nextLine();

                    System.out.print("이메일 : ");
                    String email = sc.nextLine();

                    System.out.print("부서 : ");
                    String dept = sc.nextLine();


                    map.put("name", name);
                    map.put("email", email);
                    map.put("dept", dept);

                    return map;
                })
                .toList();


        list.forEach(m -> {
            m.forEach((k, v) -> {
                System.out.println(k + " : " + v);
            });
        });

    }
}
