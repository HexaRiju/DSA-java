package LeetCodeDebugging;

import java.util.*;

public class Solution51 {
    public String minWindow(String s, String t) {
        int[] map1 = new int[256], map2 = new int[256];
        for (int i = 0; i < t.length(); i++) {
            map1[t.charAt(i)]++;
        }
        int low = 0, high = 0, min = Integer.MAX_VALUE;
        String res = "";
        while (high < s.length()) {
            if (map1[s.charAt(high)] != 0)
                map2[s.charAt(high)]++;
            while (check(map1, map2)) {
                int length = high - low + 1;
                if (min != Math.min(min, length)) {
                    res = s.substring(low, high + 1);
                    min = Math.min(min, length);
                }
                if (map1[s.charAt(low)] != 0)
                    map2[s.charAt(low)]--;
                low++;
            }
            high++;
        }
        return res;
    }

    public boolean check(int[] map1, int[] map2) {
        int i = 0;
        while (i < map1.length) {
            if (map1[i] > map2[i])
                return false;
            i++;
        }
        return true;
    }
}
