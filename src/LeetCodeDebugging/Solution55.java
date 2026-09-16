package LeetCodeDebugging;

public class Solution55 {
    public int findPages(int[] arr, int k) {
        // code here
        if(k > arr.length)
            return -1;
        int start = Integer.MIN_VALUE, end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(arr[i], start);
            end += arr[i];
        }
        while (start < end) {
            int guess = start + (end - start)/2, kp = 0;
            kp = allocation(arr, k, guess);
            if(kp > k){
                start = guess + 1;
            }
            else{
                end = guess;
            }
        }
        return end;
    }
    public int allocation(int[] arr, int k, int guess) {
        int sum = 0, allocation = 1;
        for(int i = 0; i < arr.length; i++ ) {
            if ((sum + arr[i]) <= guess) {
                sum += arr[i];
            }
            else {
                allocation++;
                sum = arr[i];
            }
        }
        return allocation;
    }
}
