package com.java.DSA.Recursion;

import java.util.*;

public class permutation {
    public static  void main(String args[]){
        System.out.println(permutations("","abc"));
    }
    public static ArrayList<String> permutations(String take, String remain){
        if(remain.isEmpty()){
            return new ArrayList<>(Collections.singletonList(take));
        }

        char ch =  remain.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i <= take.length(); i++){
            String f = take.substring(0,i);
            String s = take.substring(i);
            list.addAll(permutations(f + ch + s,remain.substring(1)));
        }
        return list;
    }
}
