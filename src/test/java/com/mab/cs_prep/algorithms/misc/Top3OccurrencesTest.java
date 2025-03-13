package com.mab.cs_prep.algorithms.misc;

import com.mab.cs_prep.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Top3OccurrencesTest {

    private Top3Occurrences top3;

    @BeforeEach
    void setUp() {
        top3 = new Top3Occurrences();
    }

    @Test
    void getTop3GreatestSubscriptions() {
        //given
        List<User> users = getUsers();

        //when
        List<Integer> top3Subscriptions = top3.getTop3GreatestSubscriptions(users);

        //then
        assertThat(top3Subscriptions).isNotEmpty();
        assertThat(top3Subscriptions).containsExactly(3, 1, 5);
    }

    @Test
    void getTop3SubscriptionsAllStreams() {
        //given
        List<User> users = getUsers();

        //when
        List<Integer> top3Subscriptions = top3.getTop3SubscriptionsAllStreams(users);

        //then
        assertThat(top3Subscriptions).isNotEmpty();
        assertThat(top3Subscriptions).containsExactly(3, 1, 5);
    }
    

    private List<User> getUsers() {
        return List.of(
                new User(1, List.of(1, 3)),
                new User(2, List.of(1, 3, 4, 5, 6)),
                new User(3, List.of(1, 2, 3)),
                new User(4, List.of(3, 4)),
                new User(5, List.of(2, 3, 5)),
                new User(6, List.of(1, 5))
        );
    }
}