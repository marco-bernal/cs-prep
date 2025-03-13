package com.mab.cs_prep.algorithms.misc;

import com.mab.cs_prep.model.User;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

/**
 * Return the top tree subscriptions.
 * For this example the result should be the subscriptions [3, 1, 5]
 *
 *  List<User> users = List.of(
 *                 new User(1, List.of(1, 3)),
 *                 new User(2, List.of(1, 3, 4, 5, 6)),
 *                 new User(3, List.of(1, 2, 3)),
 *                 new User(4, List.of(3, 4)),
 *                 new User(5, List.of(2, 3, 5)),
 *                 new User(6, List.of(1, 5))
 *         );
 */
public class Top3Occurrences {

    /**
     * Proposed solution:
     * Iterate over each user all the subscriptions this user has and add the values to a hashmap.
     * Then, count the occurrences and return the 3 greatest values.
     *
     * @param users users with their respective subscriptions.
     * @return List of top 3 subscriptions.
     */
    public List<Integer> getTop3GreatestSubscriptions(List<User> users) {

        // To save and count the occurrences of each subscription
        Map<Integer, Integer> subscriptions = new HashMap<>();

        users.stream()
                .map(User::subscriptions)
                .flatMap(List::stream)
                .forEach(
                        s -> {
                            if (subscriptions.containsKey(s)) {
                                subscriptions.put(s, subscriptions.get(s) + 1);
                            }

                            else {
                                subscriptions.put(s, 1);
                            }
                        }
                );

        return subscriptions.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * Improved version just with streams.
     *
     * @param users users with their respective subscriptions.
     * @return List of top 3 subscriptions.
     */
    public List<Integer> getTop3SubscriptionsAllStreams(List<User> users) {
        return users.stream()
                .map(User::subscriptions)
                .flatMap(List::stream)
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                ).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .limit(3) //Return map here
                .map(Map.Entry::getKey)
                .toList();
    }
}
