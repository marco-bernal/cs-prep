package com.mab.cs_prep.ds.pointers;

import java.util.Map;

public class PointersDemo {

    /**
     * Showcases pointers in Java.
     * @param map1 original values.
     * @return updated values.
     */
    public Map<String, Integer> showcasePointers(Map<String, Integer> map1) {

        // map2 and map1 point to the same map in memory.
        Map<String, Integer> map2 = map1;

        // if map1 opr map2 is updated, the other map gets updated automatically.
        // Because both maps point to the same object in memory.
        map2.replace("value", 22);

        return map2;
    }
}
