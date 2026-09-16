package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution50 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int idx = 0, sum = 0;
        ans(candidates, idx, sum, list, res, target);
        return res;
    }
    public void ans(int[] arr, int idx, int sum, List<Integer> list, List<List<Integer>> res, int t){
        if(idx == arr.length){
            if(sum == t)
                res.add(new ArrayList<>(list));
            return;
        }
        ans(arr, idx + 1, sum, list, res, t);
        if(arr[idx] + sum <= t){
            list.add(arr[idx]);
            ans(arr, idx, sum + arr[idx], list, res, t);
            list.remove(list.size() - 1);
        }
        return;
    }
}
