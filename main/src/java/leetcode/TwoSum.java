package main.src.java.leetcode;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
         twoSum(new int[]{2,4,6,8}, 12);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!map.isEmpty() && map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        return res;
    }

}




/*
Let's consider the following example:

nums = [2, 7, 11, 15]
target = 9

On the first iteration (i = 0):
The map is empty, so 2 is added to the map with index 0.

On the second iteration (i = 1):
The complement 9 - 7 = 2 is checked.
        2 is found in the map, which means the elements 2 (index 0) and 7 (index 1) sum up to the target.
        res[0] is set to 1 (current index), and res[1] is set to 0 (index of 2 in the map).

The loop exits.
The result [1, 0] is returned.*/
