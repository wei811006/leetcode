package wei.leetcode.learn.contest175;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * CheckIfNAndItsDoubleExist.
 * TODO
 * 2020/2/9 10:31 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0, max = arr.length; i < max; i++) {
            for (int j = i+1; j < max; j++) {
                if ((arr[i] < 0 && Double.valueOf(arr[i]) / 2 == Double.valueOf(arr[j]))
                        || (arr[i] >= 0 && arr[i] * 2 == arr[j])) {
                    return true;
                }
                if (arr[i] * 2 > arr[j]) {
                    continue;
                }
            }
        }

        return false;
    }
}
