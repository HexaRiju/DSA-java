package com.java.DSA.Recursion;

import java.util.ArrayList;


public class Subset {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        subsets(list, new int[]{1,2,3},0, new ArrayList<>());
        System.out.println(list);
    }
    public static void subsets(ArrayList<ArrayList<Integer>> arr, int[] n, int index, ArrayList<Integer> subset) {
        if(index == n.length) {
            ArrayList<Integer> temp = new ArrayList<>(subset);
            arr.add(temp);
            return;
        }
        subset.add(n[index]);// taking the element in the set
        subsets(arr, n, index + 1, subset);
        subset.remove(subset.size()-1);// return back to the previous set , and go without takin the element.
        subsets(arr, n, index + 1, subset);
        return;
    }
}
