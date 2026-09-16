package com.java.DSA.Revision;

public class splitAarrayLargestSum {
    public static void main(String[] args) {
        System.out.println(find(new int[]{7,2,5,8,10}, 2));
    }

    public static int find(int[] nums, int target) {
        //if target is 1 then the max value of the array is the minimized largest element.
        // as there can be subarray of size 1 like [[],[],[],[].....]
        // if target is the length of the array the sum of the array is the ans as [[            ]], as all element com in the array and only one sub array possible
        // so the range is [max of arr  - sum of arr], Wow ! a range of sorted element , binary search.
        // mean always minimum 1 piece will exist.
        int start = Integer.MIN_VALUE, end = 0;
        for (int n : nums) {
            start = Math.max(start, n);
            end += n;
        }
        while (start != end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int piece = 1;
            for (int n : nums) {
                if (sum + n > mid) {
                    sum = n;
                    piece++;
                } else {
                    sum += n;
                }
            }
            if (piece > target) {
                start = mid + 1;
            } else
                end = mid;
        }
        return end;
    }
}
