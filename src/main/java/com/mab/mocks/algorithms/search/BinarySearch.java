package com.mab.mocks.algorithms.search;

import lombok.extern.slf4j.Slf4j;

//TODO: Remove log, add problem explanation, input, output. Explain solution approaches.
@Slf4j
class BinarySearch {

    int binarySearch(int valueToSearch, int[] sortedCollection) {
        int position = 0;

        int length = sortedCollection.length;
        int middle = length / 2;

        for (int i = 0; i < length; i++) {

            log.info("cycle: " + i + " value to search: " + valueToSearch);
            log.info("length: " + length);
            log.info("middle: " + middle + " value: " + sortedCollection[middle]);

            if (valueToSearch > sortedCollection[middle]) {
                //recalculate and middle value
                middle += (length - middle) / 2;
                log.info("new middle: " + middle);
            }

            if (valueToSearch < sortedCollection[middle]) {
                //recalculate length and middle values
                middle = middle / 2;
                log.info("new middle: " + middle);
            }

            if (valueToSearch == sortedCollection[middle]) {
                log.info("value to search:" + valueToSearch + " found: at position: " + middle);
                position = middle;
                break;
            }
        }

        return position;
    }
}
