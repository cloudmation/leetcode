package main;

import java.util.HashMap;

public class LongestSubstringWithKDistinct {
    public int lengthOfLogest(String s) {
        if(s == null || s.length() == 0) return 0;
        int start = 0;
        int end = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(end < s.length()){
           if(map.size() <= 2) {
               map.put(s.charAt(end), end);
               end++;
           }
           if(map.size() > 2) {
               int leftMost = s.length();
               for(int num: map.values()) {
                   leftMost = Math.min(leftMost, num);
               }
               map.remove(s.charAt(leftMost));
               start = leftMost + 1;
           }
           res = Math.max(res, end - start);
        }
        return res;
    }

    public int lengthOfLongest2(String s) {
        int i = 0, j = -1, maxLen = 0;
        for (int k = 1; k < s.length(); k++) {
            if (s.charAt(k) == s.charAt(k - 1)) continue;
            if (j >= 0 && s.charAt(j) != s.charAt(k)) {
                maxLen = Math.max(k - i, maxLen);
                i = j + 1; }
            j = k - 1; }
        return Math.max(s.length() - i, maxLen);
    }
}
