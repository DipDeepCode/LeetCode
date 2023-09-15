package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {
    private final TwoSumII twoSumII = new TwoSumII();

    @Test
    public void test1() {
        int[] ints = twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
        assertEquals(1, ints[0]);
        assertEquals(2, ints[1]);
    }

    @Test
    public void test2() {
        int[] ints = twoSumII.twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(ints));
        assertEquals(1, ints[0]);
        assertEquals(3, ints[1]);
    }

    @Test
    public void test3() {
        int[] ints = twoSumII.twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(ints));
        assertEquals(1, ints[0]);
        assertEquals(2, ints[1]);
    }

    @Test
    public void test4() {
        int[] ints = twoSumII.twoSum(new int[]{5,25,75}, 100);
        System.out.println(Arrays.toString(ints));
        assertEquals(2, ints[0]);
        assertEquals(3, ints[1]);
    }

    @Test
    public void test5() {
        int[] ints = twoSumII.twoSum(new int[]{3,24,50,79,88,150,345}, 200);
        System.out.println(Arrays.toString(ints));
        assertEquals(3, ints[0]);
        assertEquals(6, ints[1]);
    }

    @Test
    public void test6() {
        int[] ints = twoSumII.twoSum(new int[]{12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997}, 542);
        System.out.println(Arrays.toString(ints));
        assertEquals(24, ints[0]);
        assertEquals(32, ints[1]);
    }
}