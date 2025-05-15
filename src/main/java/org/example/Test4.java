package org.example;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};

        System.out.println(maxCulc(nums));
    }

    static int maxCulc(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }
}
