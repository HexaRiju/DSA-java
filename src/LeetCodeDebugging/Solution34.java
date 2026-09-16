package com.java.DSA.LeetCodeDebugging;

public class Solution34 {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int i = 0, j = 0;
        if(strs.length <= 1){
            return strs[0];
        }
        while (i < strs[0].length() && j < strs[1].length()) {
            if (strs[0].charAt(i) == strs[1].charAt(j)) {
                s += strs[0].charAt(i);
                i++;
                j++;
            } else {
                break;
            }
        }
        StringBuffer x = new StringBuffer();
        for (int k = 2; k < strs.length; k++) {
            x.setLength(0);
            i = 0;
            j = 0;
            while (i < s.length() && j < strs[k].length()) {
                if (s.charAt(i) == strs[k].charAt(j)) {
                    x.append(strs[k].charAt(j));
                    i++;
                    j++;
                } else {
                    break;
                }
            }
            s = x.toString();
        }
        return s.toString();
    }
}
