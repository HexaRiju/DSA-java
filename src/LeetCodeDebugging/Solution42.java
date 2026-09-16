package com.java.DSA.LeetCodeDebugging;

public class Solution42 {
    public boolean canTransform(String start, String result) {
        int count = 0;
        if(start.length() != result.length())
            return false;
        else{
            if(start.length() == 1){
                return start.equals(result);
            }
            StringBuffer s = new StringBuffer("");
            for(int i = 0; i < start.length() - 1; i = i + 2){
                if(start.substring(i,i + 2).equals(result.substring(i,i + 2))){
                    count++;
                }
                else{
                    s.append(start.charAt(i + 1));
                    s.append(start.charAt(i));
                    if(s.toString().equals(result.substring(i,i + 2)))
                        count++;
                    else
                        return false;
                    s.setLength(0);
                }
            }
            return true;
        }
    }
}
