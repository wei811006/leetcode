package wei.leetcode.learn.string;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893 GroupsOfSpecialEquivalentStrings.
 * <p>
 * You are given an array A of strings.
 * <p>
 * A move onto S consists of swapping any two even indexed characters of S,
 * or any two odd indexed characters of S.
 * <p>
 * Two strings S and T are special-equivalent if after any number of moves onto S, S == T.
 * <p>
 * For example, S = "zzxy" and T = "xyzz" are special-equivalent
 * because we may make the moves "zzxy" -> "xzzy" -> "xyzz"
 * that swap S[0] and S[2], then S[1] and S[3].
 * <p>
 * Now, a group of special-equivalent strings from A is a non-empty subset of A such that:
 * <p>
 * Every pair of strings in the group are special equivalent, and;
 * The group is the largest size possible (ie.,
 * there isn't a string S not in the group such that S is special equivalent to
 * every string in the group)
 * Return the number of groups of special-equivalent strings from A.
 * <p>
 * 2020/2/4 9:14 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class GroupsOfSpecialEquivalentStrings {

    public int numSpecialEquivGroups(String[] source) {
        Set<String> groups = new HashSet<>();

        for( String s: source ) {
            int charLen = (s.length() + 1) / 2;
            char[] odd = new char[charLen];
            char[] even = new char[charLen];

            for( int i = 0, max = s.length(); i < max; i++ ) {
                if ( i % 2 == 0 ) {
                    even[i/2] = s.charAt(i);
                }
                else {
                    odd[i/2] = s.charAt(i);
                }
            }
            Arrays.sort(odd);
            Arrays.sort(even);
            groups.add(String.valueOf(odd) + String.valueOf(even));
        }

        return groups.size();
    }

}
