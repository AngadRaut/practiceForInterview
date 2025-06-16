package org.example.array;

public class FindRepeatedNo_N_Time {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 5, 5, 6, 7, 9, 3, 4, 6, 5, 7, 3};
        int k = 3;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == k) {
                System.out.println(nums[i]);
            }else {
                System.out.println(k+" Times no repeated no in given array");
                break;
            }
        }
    }
}