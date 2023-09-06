package com.mab.mocks.mxbe;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Combination SUm
 * Given an array and a target, find getUsers the combinations that sum the target
 * example:
 * input[10,1,2,6,7,1,5], target 8
 * result:
 * [1,7]
 * [1,2,5]
 * [2,6]
 * [1,1,6]
 *
 * Sorted:
 * 1,1,2,5,6,7,10
 *
 * Take the first left number and the last right number and sum them up
 * 1, 10
 * if they > target, then move to the next greater number in the left
 * 1, 7
 * if they match, add that combination to the result,
 * then move to the next lesser number in the left and the next greater in the right
 * 1,6
 *
 *
 * 1,7
 * 1,6,1
 *
 * That doesn't work either. Think another solution
 *
 */
@Data
public class CombinationSumMock {

   public List<int[]> getCombinations(int[] values, int target) {
       int tmp = 0;
       int[] aggregatedRes = new int[values.length];
       List<int[]> result = new ArrayList<>();

       for (int i : values) {
           tmp += i;

           if(tmp > target) {
               tmp = 0;
               continue;
           }

           if (i == target) {
               int[] res = new int[values.length];
               res[i] = i;
               result.add(res);
               continue;
           }

           if(tmp < target) {
               aggregatedRes[i] = i;
               result.add(aggregatedRes);
           }
       }
       return result;
   }
}
