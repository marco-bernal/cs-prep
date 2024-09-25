package com.mab.cs_prep.mocks.mxbe;

import com.mab.cs_prep.mocks.mxbe.CombinationSumMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombinationSumMockTest {

    private CombinationSumMock combinationSumMock;

    @BeforeEach
    void setUp() {
        combinationSumMock = new CombinationSumMock();
    }

    @Test
    void shouldRetrieveCombinationSumArrays() {
        //given
        int[] array = {10,1,2,6,7,1,5};
        int target = 8;

        //when
        combinationSumMock.getCombinations(array, target);

        //then
    }

}
