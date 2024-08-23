package com.mab.mocks.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramTest {

    private Anagram anagram;

    @BeforeEach
    void setUp() {
        anagram = new Anagram();
    }

    @Test
    void isAnagramBaseCase() {
        //given
        String string1 = "anagram";
        String string2 = "nagaram";

        //when
        boolean result = anagram.isAnagram(string1, string2);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void edgeCase1() {
        //given
        String string1 = "gram";
        String string2 = "nagaram";

        //when
        boolean result = anagram.isAnagram(string1, string2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void edgeCase2() {
        //given
        String string1 = "g";
        String string2 = "g";

        //when
        boolean result = anagram.isAnagram(string1, string2);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void edgeCase2a() {
        //given
        String string1 = "h";
        String string2 = "g";

        //when
        boolean result = anagram.isAnagram(string1, string2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void edgeCase3() {
        //given
        String string1 = "";
        String string2 = "";

        //when
        boolean result = anagram.isAnagram(string1, string2);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void groupAnagrams() {
        //given
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        //when
        Collection<List<String>> result = anagram.groupAnagrams(words);

        //then
        assertThat(result).isNotEmpty();
        result.forEach(System.out::println);
    }
}