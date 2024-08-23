package com.mab.mocks.algorithms.recursion;

import lombok.extern.slf4j.Slf4j;

//TODO: Remove log, add problem explanation, input, output. Explain solution approaches.
@Slf4j
class Factorial {

    int getFactorial(int number) {
        //base case
        if (number <= 0) {
            return 1;
        }//recursive case
        else {
            log.info("Calling myself. number: {}", number);
            return number * getFactorial(number - 1);
        }
    }
}
