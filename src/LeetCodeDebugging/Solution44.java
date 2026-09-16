package com.java.DSA.LeetCodeDebugging;

public class Solution44 {
    public int maximumRemovals(String s, String p, int[] removable) {
        if (s.length() == p.length()) {
            return 0;
        }
        int start = 0, end = removable.length , k = 0;
        while (start <= end) {
            k = start + (end - start) / 2;
            StringBuffer x = new StringBuffer("");
            char[] ch = s.toCharArray();
            for (int i = 0; i < k; i++)
                ch[removable[i]] = '#';
            for (int i = 0; i < s.length(); i++) {
                if (ch[i] == '#')
                    continue;
                else {
                    x.append(ch[i]);
                }
            }
            int l = 0, r = 0;
            boolean b = false;
            while (l < x.length() && r < p.length()) {
                if (x.charAt(l) == p.charAt(r)) {
                    l++;
                    r++;
                } else
                    l++;
            }
            if(r == p.length())
                b=true;
            if (b) {
                start = k + 1;
            } else
                end = k - 1;
            x.setLength(0);
        }
        return end;
    }
}
