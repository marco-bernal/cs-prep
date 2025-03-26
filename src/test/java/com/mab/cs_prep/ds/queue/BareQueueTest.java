package com.mab.cs_prep.ds.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BareQueueTest {

    private BareQueue bareQueue;

    @BeforeEach
    void setUp() {
        bareQueue = new BareQueue(3);
    }

    @Test
    void insert() {
        //when
        bareQueue.insert(5);
        bareQueue.insert(3);
        bareQueue.insert(1);

        //then
        assertThat(bareQueue.peek()).isEqualTo(5);
        assertThat(bareQueue.getNoElements()).isEqualTo(3);
    }

    @Test
    void delete() {
        //given
        bareQueue.insert(5);
        bareQueue.insert(3);
        bareQueue.insert(1);

        //when
        bareQueue.delete();

        //then
        assertThat(bareQueue.peek()).isEqualTo(3);
        assertThat(bareQueue.getNoElements()).isEqualTo(2);
    }

    @Test
    void isEmpty() {
        //then
        assertThat(bareQueue.isEmpty()).isTrue();
    }

    @Test
    void isFull() {
        //given
        bareQueue.insert(5);
        bareQueue.insert(3);
        bareQueue.insert(1);

        //then
        assertThat(bareQueue.isFull()).isTrue();
    }
}