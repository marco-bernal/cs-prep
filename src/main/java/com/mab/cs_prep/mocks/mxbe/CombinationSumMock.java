package com.mab.cs_prep.mocks.mxbe;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum
 * Given an array and a target, find getUsers the combinations that sum the target
 * example:
 * input[10,1,2,6,7,1,5], target 8
 * result:
 * [1,7]
 * [1,2,5]
 * [2,6]
 * [1,1,6]
 *TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */

/**
 * FIXME: Implement solution.
 */
@Slf4j
public class CombinationSumMock {

   public List<int[]> getCombinations(int[] values, int target) {
       List<int[]> results = new ArrayList<>();
       Arrays.sort(values);
       int middle = values.length / 2; // 7/2 = 3 (4)

       int middleLength = middle + 1;

       int[] leftValues = new int[middleLength]; //4
       int[] rightValues= new int[values.length - middleLength]; //3
       for (int i=0, j=middleLength; i < middleLength && j < values.length; i++) {
           if (i <= middle) {
               leftValues[i] += values[i];

           } else {
               rightValues[i] += values[i];

           }
       }

       for (int i=0; i < middleLength; i++) {
           leftValues[i] += values[i];
           log.info("[leftValues] : {}", leftValues[i]); //OK: [1,1,2,5,0,0,0]
       }
       for (int i=middleLength, j=0; i < values.length; i++, j++) {
           rightValues[j] += values[i];
           log.info("[rightValues] : {}", rightValues[j]); //OK: [0,0,0,0,6,7,10]
       }



       int sum = 0;
       for (int i=0; i < leftValues.length; i++) {
           for (int j=0; j < rightValues.length; j++) {

                log.info("[i,j] : [{},{}]", leftValues[i], rightValues[j]);

//               if (leftValues[i] + rightValues[j] < target) {
//                   sum += leftValues[i] + rightValues[j];
//
//
//                   if (sum == target) {
//
//                   }
//               }

           }
       }

       return results;
   }
}
