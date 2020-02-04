package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

/**
 * 1189 MaximumNumberOfBalloons.
 * <p>
 * Given a string text, you want to use the characters of text to
 * form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once.
 * Return the maximum number of instances that can be formed.
 * <p>
 * 2020/2/4 8:54 下午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] data = new int[5];

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'a':
                    data[0] += 2;
                    break;
                case 'b':
                    data[1] += 2;
                    break;
                case 'l':
                    data[2]++;
                    break;
                case 'n':
                    data[3] += 2;
                    break;
                case 'o':
                    data[4]++;
                    break;
            }
        }

        int result = data[0];
        for (int i : data) {
            if (i < result) result = i;
        }
        return result/2;
    }
}
