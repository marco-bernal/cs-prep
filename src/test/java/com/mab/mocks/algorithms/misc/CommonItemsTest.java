package com.mab.mocks.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommonItemsTest {

    private CommonItems commonItems;

    @BeforeEach
    void setUp() {
        commonItems = new CommonItems();
    }

    @Test
    void shouldCompareIfTheInputsContainCommonItemsWhenTrue() {
        //given
        String[] input1 = {"s", "h", "g", "m", "e", "f", "q", "b"};
        String[] input2 = {"v", "a", "l", "t", "z", "e"};

        //when
        boolean result = commonItems.hasCommonItemsRefactored(input1, input2);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void containsCommonItemsWhenFalse() {
        //given
        String[] input1 = {"s", "h", "g", "m", "e", "f", "q", "b"};
        String[] input2 = {"v", "a", "l", "t", "z"};

        //when
        boolean result = commonItems.hasCommonItemsRefactored(input1, input2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldCompareIfTheInputsContainCommonItemsWhenFalse() {
        //given
        String[] input1 = {"s", "h", "g", "m", "e", "f", "q", "b"};
        String[] input2 = {"v", "a", "l", "t", "z"};

        //when
        boolean result = commonItems.hasCommonItems(input1, input2);

        //then
        assertThat(result).isFalse();
    }
}
