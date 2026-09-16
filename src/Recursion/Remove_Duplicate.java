package com.java.DSA.Recursion;

public class Remove_Duplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("baccad",""));
        System.out.println(removeString("baappleccad"));
    }
    public static String removeDuplicate(String str1, String str2) {
        if(str1.isEmpty()){
            return str2;
        }
        char ch = str1.charAt(0);
        if(ch == 'a'){
             return removeDuplicate(str1.substring(1), str2);
        }
        else {
            return removeDuplicate(str1.substring(1), str2 + ch);
        }
    }
    public static String removeString(String str1) {
        if(str1.isEmpty()){
            return "";
        }

        if(str1.startsWith("apple"))
            return removeString(str1.substring(5));
        else
            return str1.charAt(0) + removeString(str1.substring(1));
    }
}
