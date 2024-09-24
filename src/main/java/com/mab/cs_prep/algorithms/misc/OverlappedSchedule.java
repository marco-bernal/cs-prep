package com.mab.cs_prep.algorithms.misc;

/**
 * Given two pair values of Interval(start, end) verify if the intervals overlap, if so merge them
 * into one
 * Example:
 * [start: 1, end: 4] [start: 2, end: 3] -> overlap [start: 1, end: 4]
 * [start: 1, end: 4] [start: 6, end: 9] -> don't overlap
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */
class OverlappedSchedule {

    int[] getInterval(int[] interval1, int[] interval2) {
        if (doesOverlap(interval1, interval2)) {
            int[] result = new int[2];
            result[0] = interval1[0];
            result[1] = getEndTime(interval1, interval2);
            return result;
        } else {
            throw new RuntimeException("Don't overlap");
        }
    }

    private boolean doesOverlap(int[] interval1, int[] interval2) {
        return interval2[0] >= interval1[0] && interval2[0] <= interval1[1];
    }

    private int getEndTime(int[] interval1, int[] interval2) {
        if (interval1[1] > interval2[1]) {
            return interval1[1];
        } else {
            return interval2[1];
        }
    }
}

