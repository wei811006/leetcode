package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

/**
 * DesignHashSet.
 * <p>
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 * <p>
 * 2020/02/2020/2/14
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DesignHashSet {

    boolean[] values;

    /**
     * Initialize your data structure here.
     **/
    public DesignHashSet() {
        values = new boolean[10000];
    }

    public void add(int key) {
        values[key] = true;
    }

    public void remove(int key) {
        values[key] = false;
    }

    /**
     * Returns true if this set contains the specified element
     **/
    public boolean contains(int key) {
        return values[key];
    }

}
