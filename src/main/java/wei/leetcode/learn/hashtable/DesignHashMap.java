package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * 706 DesignHashMap.
 * Design a HashMap without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * put(key, value) : Insert a (key, value) pair into the HashMap.
 * If the value already exists in the HashMap, update the value.
 *
 * get(key): Returns the value to which the specified key is mapped,
 * or -1 if this map contains no mapping for the key.
 *
 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 *
 * <p>
 * 2020/02/2020/2/13
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class DesignHashMap {

    int[] values;

    /**
     * Initialize your data structure here.
     **/
    public DesignHashMap() {
        values = new int[1000000];
    }

    /**
     * value will always be non-negative.
     **/
    public void put(int key, int value) {
        if ( value == 0 ) {
            value = Integer.MAX_VALUE;
        }
        values[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or -1 if this map contains no mapping for the key
     **/
    public int get(int key) {
        if ( values[key] == Integer.MAX_VALUE ) {
            return 0;
        }
        if ( values[key] != 0 ) {
            return values[key];
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key
     * if this map contains a mapping for the key
     **/
    public void remove(int key) {
        values[key] = 0;
    }
}
