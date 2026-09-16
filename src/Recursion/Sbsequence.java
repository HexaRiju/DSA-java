package com.java.DSA.Recursion;

import java.util.ArrayList;

public class Sbsequence {
    public static void main(String[] args) {
        System.out.println(subSequence1("","abc"));
        subSequence("","abc");
    }
    public static void subSequence(String take, String remain){
        if(remain.isEmpty()){
            System.out.println(take);
            return;
        }
        char ch = remain.charAt(0);
        subSequence(take + ch , remain.substring(1));
        subSequence(take ,  remain.substring(1));
    }
    public static ArrayList<String> subSequence1(String take, String remain){
        if(remain.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(take);
            return list;
        }
        char ch = remain.charAt(0);
        ArrayList<String> left = subSequence1(take + ch , remain.substring(1));
        ArrayList<String> right = subSequence1(take, remain.substring(1));
        left.addAll(right);
        return left;
    }
}
