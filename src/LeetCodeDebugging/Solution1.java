package com.java.DSA.LeetCodeDebugging;

import java.util.*;
public class Solution1 {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(i);
                    list1.add(j);
                    list.add(list1);
                }
            }
        }
        for(int j = 0; j < list.size(); j++){
            int rStart = list.get(j).get(0);
            int cStart = list.get(j).get(1);
            for(int i = rStart - 1; i >= 0; i--){// up
                matrix[i][cStart] = 0;
            }
            for(int i = rStart + 1; i < matrix.length; i++){// down
                matrix[i][cStart] = 0;
            }
            for(int i = cStart + 1; i < matrix[rStart].length; i++){// right
                matrix[rStart][i] = 0;
            }
            for(int i = cStart - 1; i >= 0; i--){// left
                matrix[rStart][i] = 0;
            }
        }
    }
}
