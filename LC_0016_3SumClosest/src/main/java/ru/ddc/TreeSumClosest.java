package ru.ddc;

import java.util.Arrays;

public class TreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int numSum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - numSum) < Math.abs(target - result)) {
                    result = numSum;
                }
                if (target - result == 0) {
                    return result;
                }
                if (numSum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
