package com.mab.cs_prep.algorithms.misc;

//TODO: Add problem explanation, input, output. Explain solution approaches.
class PrimeNumber {

    boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
