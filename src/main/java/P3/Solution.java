package P3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int length = i - start;
                start = Math.max(map.get(c) + 1, start);
                if (length > maxLength) {
                    maxLength = length;
                }
            }
            map.put(c, i);
        }
        return Math.max(s.length() - start, maxLength);
    }
}
