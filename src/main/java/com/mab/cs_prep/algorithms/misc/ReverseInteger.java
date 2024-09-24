package com.mab.cs_prep.algorithms.misc;

import org.springframework.stereotype.Component;

import static java.lang.String.format;

//TODO: Delete component.
// Explain solution approaches. Enhance with for each loops / streams if possible.
@Component
public class ReverseInteger {

    int reverseInteger(int number) {
        int result = 0;
        int originalNumber = number;

        //converts negative number to positive
        if (originalNumber < 0) {
            number *= -1;
        }

        //TODO: Add Overflow error handling
        try {
            //reverses the number
            for (int i = number; i > 0; i /= 10) {
                result = (result * 10) + (i % 10);
            }
        } catch (Exception e) {
            System.out.println(format("An error has occurred: %1$s", e.getLocalizedMessage()));
            return 0;
        }

        return originalNumber < 0 ? result * -1 : result;
    }
}
