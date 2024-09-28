package com.mab.cs_prep.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 1. Two Sum.
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 * Solution: Brute force compare all the values in the array.
 * Initialize 2 pointers: input[0] and input[1]
 * compare with for loops input[0] against the rest of the values
 * if not found increase both pointers by 1 and check again, till the end of the array.
 * Complexity: Quadratic 0(n2)
 *
 * Improved solution:
 * Add a HasMap into the equation for storing values and iterate the array only once.
 * start with the first element input[0], add a variable diff to compute the difference between the target and input[0]
 * check in the HashMap if the diff value exists. If true: return the key of the HashMap as the index, and the value of i.
 * If it doesn't exist: add the index of input[0] as key and the value.
 * Complexity: Linear O(n)
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 * Yes, by adding a HashMap and iterating the array only once.
 */
public class TwoSum {

    public int[] getTwoSumValuesBruteForce(int[] input, int target) {
        int[] result = new int[2];

        int sum;
        for (int i = 0; i < input.length; i++) {
            System.out.println();

            for (int j = i + 1; j < input.length; j++) {
//                System.out.print("i: " + i + " j: " + j + "\t");
//                System.out.print("[i]: " + input[i] + " [j]: " + input[j] + "\t");

                sum = input[i] + input[j];

                if (sum == target) {
                    //Returns the values that sum the target
//                    result[0] = input[i];
//                    result[1] = input[j];

                    //Returns the position of the values that sum the target
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] getTwoSumValuesImproved(int[] input, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];

        int diff;
        for (int i=0; i < input.length; i++) {
            diff = target - input[i];

            //System.out.println("diff: " + diff + "\tinput[i]: " + input[i] + "\ti: " + i);

            if (hashMap.containsKey(diff)) {
                result[0] = hashMap.get(diff);
                result[1] = i;
                break;
            } else {
                //value = input[i], index = i
                hashMap.put(input[i], i);
            }
        }
        return result;
    }
}
