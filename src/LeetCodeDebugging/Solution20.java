package com.java.DSA.LeetCodeDebugging;
import java.util.*;
public class Solution20{
    public List<List<Integer>> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                list.add(new ArrayList<>(List.of(i, j)));
            }
        }
        list.sort((list1,list2) ->
                (Math.abs(list1.get(0) - rCenter)+Math.abs(list1.get(1) - cCenter)) - (Math.abs(list2.get(0) - rCenter)+Math.abs(list2.get(1) - cCenter)));
        int[][] res = new int[rows*cols][2];
        for(int i = 0; i < rows; i++){
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }
        return list;
    }
    // or this same question can be done with just using arrays.
    public int[][] allCellsDistOrder1(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows*cols][2];
        int index = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res[index][0] = i;
                res[index][1] = j;
                index++;
            }
        }
        Arrays.sort(res,(a,b)->{
            int x = Math.abs(a[0]-rCenter) + Math.abs(a[1]-cCenter);
            int y = Math.abs(b[0]-rCenter) + Math.abs(b[1]-cCenter);
            return x - y;
        });
        return res;
    }
}
