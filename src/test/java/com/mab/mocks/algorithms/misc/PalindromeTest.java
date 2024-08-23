package com.mab.mocks.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void shouldCheckIfAStringIsPalindromeWhenTrue() {
        //given
        String value = "caleselac";

        //when
        boolean result = palindrome.isPalindrome(value);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldCheckIfAStringIsPalindromeWhenFalse() {
        //given
        String value = "not a palindrome";

        //when
        boolean result = palindrome.isPalindrome(value);

        //then
        assertThat(result).isFalse();
    }
}
