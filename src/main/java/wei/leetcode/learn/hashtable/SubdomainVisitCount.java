package wei.leetcode.learn.hashtable;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811 SubdomainVisitCount.
 * <p>
 * A website domain like "discuss.leetcode.com" consists of various subdomains.
 * At the top level, we have "com", at the next level,
 * we have "leetcode.com", and at the lowest level, "discuss.leetcode.com".
 * When we visit a domain like "discuss.leetcode.com",
 * we will also visit the parent domains "leetcode.com" and "com" implicitly.
 * <p>
 * Now, call a "count-paired domain" to be a count
 * (representing the number of visits this domain received),
 * followed by a space, followed by the address.
 * An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * <p>
 * We are given a list cpdomains of count-paired domains.
 * We would like a list of count-paired domains,
 * (in the same format as the input, and in any order),
 * that explicitly counts the number of visits to each subdomain.
 * <p>
 * 2020/2/10 9:08 上午
 *
 * @author wei
 * @version 1.0.0
 **/
@Component
public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countMap = new HashMap<>();

        for( String cpdomain: cpdomains ) {
            String[] domain = cpdomain.split(" ");
            int times = Integer.valueOf(domain[0]);
            String[] subdomain = domain[1].split("\\.");
            String str = "";
            for( int max = subdomain.length, i = max -1; i >= 0; i-- ) {
                str = subdomain[i] + str;
                int count = countMap.getOrDefault(str, 0);
                countMap.put(str, times + count);
                str = "." + str;
            }
        }

        List<String> result = new ArrayList<>();
        countMap.forEach((k, v) -> {
            result.add(v + " " + k);
        });

        return result;
    }

}
