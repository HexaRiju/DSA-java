package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution28 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        int max = 0, min = 0;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b) ->{
            return a[0]-b[0];
        });
        list.add(new ArrayList<>(List.of(intervals[0][0],intervals[0][1])));
        int j = 1,k = 0;
        while(j <  intervals.length){
            min = Math.min(list.get(k).get(0),intervals[j][0]);
            max = Math.max(list.get(k).get(1),intervals[j][1]);
            if((list.get(k).get(1) >= intervals[j][0] && list.get(k).get(1) <= intervals[j][1]) || (intervals[j][1] >= list.get(k).get(0) && intervals[j][1] <= list.get(k).get(1))){
                list.set(k,new ArrayList<>(List.of(min,max)));
            }
            else{
                list.add(new ArrayList<>(List.of(intervals[j][0],intervals[j][1])));
                k++;
            }

            j++;
        }
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < ans.length ; i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}
