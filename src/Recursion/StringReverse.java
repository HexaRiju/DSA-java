package com.java.DSA.Recursion;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("debojyoti"));
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }
        else if(str.length() == 1){
            return str;
        }
        else{
            char ch = str.charAt(str.length()-1);
            return ch + reverse(str.substring(0,str.length() - 1));
        }
    }
}
