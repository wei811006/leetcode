package wei.leetcode.learn.sort;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 1356 Sort Integers by The Number of 1 Bits.
 * <p>
 * Given an integer array arr.
 * You have to sort the integers in the array in ascending order by
 * the number of 1's in their binary representation and
 * in case of two or more integers have the same number
 * of 1's you have to sort them in ascending order.
 * <p>
 * Return the sorted array.
 * <p>
 * 2020/2/29
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SortIntegersByTheNumberOf1Bits {

    public int[] sortByBits(int[] arr) {
        Map<Integer, List> sortMap = new TreeMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int count = Integer.bitCount(arr[i]);
            List set = sortMap.getOrDefault(count, new ArrayList());
            set.add(arr[i]);
            sortMap.put(count, set);
        }
        List<Integer> list = new ArrayList<>();
        sortMap.forEach(
                (k, data) -> data.stream().sorted().forEach(
                        v -> list.add(Integer.parseInt(String.valueOf(v)))
                )
        );

        for (int i = 0; i < length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
