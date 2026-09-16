package com.java.DSA.Recursion;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(new int[] {1,2,3,1,9,20},8 , 0));
        System.out.println(BothIndex(new int[] {1,2,4,5,6,4,7}, 4,0,list));
        System.out.println(NewBoth(new int[] {1,2,4,5,6,4,7}, 4,0));
    }
    public static boolean search(int[] arr,int target, int index){
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target ||  search(arr, target, index + 1);
    }
    public static ArrayList<Integer> BothIndex(int[] arr , int target , int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return BothIndex(arr, target, index + 1, list);
    }
    // creating the list in the function body itself, not in the argument;
    public static ArrayList<Integer> NewBoth(int [] arr , int target ,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        list.addAll( NewBoth(arr , target , index + 1));
        return list;
    }
}
