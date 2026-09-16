package com.java.DSA.LeetCodeDebugging;

public class Solution39 {
    public int numWays(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                count++;
        }
        if(count % 3 != 0)
            return 0;
        if(count == 0){
            return(int)((s.length() - 1)*((s.length() - 2)/2)% 1000000007L);
        }
        int distribution = count/3,split = 3,permutation = 1,c_1 = 0,c_0 = 0;
        int i = 0;
        while(i < s.length() && split > 0){
            if(c_1 < distribution && s.charAt(i) == '1'){
                c_1++;
                i++;
            }
            else{
                if(c_1 == distribution && s.charAt(i) == '0'){
                    c_0++;
                    i++;
                }
                else if(c_1 == distribution && s.charAt(i) == '1'){
                    split--;
                    permutation *= (c_0 + 1);
                    c_0 = 0;
                    c_1 = 0;
                }
                else{
                    i++;
                }

            }
        }
        return (int)(permutation% 1000000007L);
    }
}
