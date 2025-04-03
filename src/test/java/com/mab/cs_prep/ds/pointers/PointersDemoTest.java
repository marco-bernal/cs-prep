package com.mab.cs_prep.ds.pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PointersDemoTest {

    private PointersDemo pointersDemo;

    @BeforeEach
    void setUp() {
        pointersDemo = new PointersDemo();
    }

    @Test
    void showcasePointers() {
        //given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("value", 11);

        //when
        Map<String, Integer> result = pointersDemo.showcasePointers(map1);

        //then
        assertThat(result.get("value")).isEqualTo(22);
    }
}