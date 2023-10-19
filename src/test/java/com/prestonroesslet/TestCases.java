package com.prestonroesslet;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestCases {

    /*
     * Equivalence Classes:
     * Invalid Inputs:
     * 1. Null List
     * 2. Null Target
     *
     * Valid Inputs:
     * 3. Empty List
     * 4. List of size 1
     * 5. List of size 2 or greater with positive target
     * 6. List of size 2 or greater with negative target
     *
     * Boundary Values:
     * 7. MAX_INT
     * 8. MIN_INT
     */

    @Test
    public void testNullList() {
        assertEquals(-1, NumPairs.totalNumPairs(null, 1));
    }

    @Test
    public void testNullTarget() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        assertEquals(-1, NumPairs.totalNumPairs(nums, null));
    }

    @Test
    public void testEmptyList() {
        List<Integer> nums = new ArrayList<>();
        assertEquals(0, NumPairs.totalNumPairs(nums, 1));
    }

    @Test
    public void testListSizeOne() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        assertEquals(0, NumPairs.totalNumPairs(nums, 1));
    }

    @Test
    public void testPositiveTarget() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        assertEquals(1, NumPairs.totalNumPairs(nums, 3));
    }

    @Test
    public void testNegativeTarget() {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-2);
        assertEquals(1, NumPairs.totalNumPairs(nums, -3));
    }

    @Test
    public void testMaxInt() {
        List<Integer> nums = new ArrayList<>();
        nums.add(Integer.MAX_VALUE);
        nums.add(Integer.MAX_VALUE);
        assertEquals(1, NumPairs.totalNumPairs(nums, Integer.MAX_VALUE * 2));
    }

    @Test
    public void testMinInt() {
        List<Integer> nums = new ArrayList<>();
        nums.add(Integer.MIN_VALUE);
        nums.add(Integer.MIN_VALUE);
        assertEquals(1, NumPairs.totalNumPairs(nums, Integer.MIN_VALUE * 2));
    }

}
