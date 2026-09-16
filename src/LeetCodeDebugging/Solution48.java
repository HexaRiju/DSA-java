package com.java.DSA.LeetCodeDebugging;

import java.util.*;

public class Solution48 {
    //    public boolean checkInclusion(String s1, String s2) {
//        if(s1.length() > s2.length())
//            return false;
//        int i = 0, j = s1.length();
//        char[] ch = s1.toCharArray();
//        Arrays.sort(ch);
//        while(j <= s2.length()){
//            char[] ch2 = s2.substring(i, j).toCharArray();
//            Arrays.sort(ch2);
//            if(Arrays.equals(ch, ch2)){
//                return true;
//            }
//            i++;
//            j++;
//        }
//        return false;
//    }
    public boolean checkInclusion(String s1, String s2) {
        int[] ch1 = new int[26], ch2 = new int[26];
        if (s1.length() > s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            ch1[s1.charAt(i) - 'a']++;
            ch2[s2.charAt(i) - 'a']++;
        }
        if (s1.length() == s2.length()) {
            return Arrays.equals(ch1, ch2);
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            ch2[s2.charAt(i - s1.length()) - 'a']--;
            ch2[s2.charAt(i) - 'a']++;
            if (Arrays.equals(ch1, ch2)) return true;
        }
        return false;
    }
}
