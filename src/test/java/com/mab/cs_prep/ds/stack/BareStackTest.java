package com.mab.cs_prep.ds.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BareStackTest {

    private BareStack bareStack;

    @BeforeEach
    void setUp() {
        bareStack = new BareStack(3);
    }

    @Test
    void push() {
        //when
        bareStack.push('a');
        bareStack.push('x');

        //then
        assertThat(bareStack.peak()).isEqualTo('x');
    }

    @Test
    void pop() {
        //given
        bareStack.push('a');
        bareStack.push('x');

        //when
        bareStack.pop();

        //then
        assertThat(bareStack.peak()).isEqualTo('a');
    }

    @Test
    void isEmpty() {
        //then
        assertThat(bareStack.isEmpty()).isTrue();
    }

    @Test
    void isFull() {
        //given
        bareStack.push('a');
        bareStack.push('x');
        bareStack.push('t');

        //then
        assertThat(bareStack.isFull()).isTrue();
    }
}