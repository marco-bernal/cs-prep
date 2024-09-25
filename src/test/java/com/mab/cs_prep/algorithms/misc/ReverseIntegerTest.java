package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;

//TODO: delete spring
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ReverseIntegerTest {

    @Autowired
    private ReverseInteger service;

    @Test
    void shouldReversePositiveInteger() {
        //when
        Integer result = service.reverseInteger(62829);

        //then
        assertThat(result).isEqualTo(92826);
    }
}
