package com.prestonroesslet;

import java.util.ArrayList;
import java.util.List;

public class NumPairs {

    public static int totalNumPairs(List<Integer> nums, Integer target) {

        Integer numPairs = 0;

        // If the list is null or target is null, return -1
        if (nums == null || target == null) {
            return -1;
        }

        // If the list size is less than 2, return 0
        if (nums.size() < 2) {
            return 0;
        }

        // If list has at least 2 numbers, find total number of pairs that sum to target
        for (int i = 0; i < nums.size(); i++) {
            Integer firstNum = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                Integer secondNum = nums.get(j);
                if (firstNum + secondNum == target) {
                    numPairs++;
                }
            }
        }

        return numPairs;
    };

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(totalNumPairs(nums, 3));
    }
}