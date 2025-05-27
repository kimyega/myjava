package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

;

public class TestList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        IntStream.range(1, 6).forEach(list::add);

        for (int n : list) {
            System.out.println(n);
        }

        list.forEach(System.out::println);
    }
}
