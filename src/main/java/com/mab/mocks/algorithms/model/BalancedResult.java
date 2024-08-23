package com.mab.mocks.algorithms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BalancedResult {
    private List<Integer> leftList;
    private List<Integer> rightList;
}
