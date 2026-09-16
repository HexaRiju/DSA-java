package LeetCodeDebugging;




import java.sql.SQLOutput;
import java.util.*;

public class Debugging {
    public static void main(String[] args){
        //System.out.println(specialArray(new int[]{0,4,3,0,4}));
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        merge(nums1,3,nums2,3 );
//        //System.out.println(Arrays.toString(nums1));
//        System.out.println(thirdMax(new int[] {1,2,-2147483648}));
        //System.out.println(threeSum(new int[] {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10}));
        //System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
        //System.out.println(Arrays.deepToString(generateMatrix(3)));
        //System.out.println(Arrays.deepToString(spiralMatrixIII(5,6,1,4)));
//        Solution1 sol = new Solution1();
//        int [][] arr = new int[][]{{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
//        sol.setZeroes(arr);
//        System.out.println(Arrays.deepToString(arr));
//        int[] arr1 = new int[]{-1,1,0,-3,0};
//        System.out.println(Arrays.toString(new Solution2().productExceptSelf(arr1)));
        //System.out.println(new Solution3().canJump(new int[]{3,2,1,0,4}));
//        int[] arr = new int[]{2,1,1,2};
//        Solution5 s = new Solution5();
//        s.sortColors(arr);
//        Solution4 s = new Solution4();
//        s.rotate(arr,3);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//        Solution6 solution6 = new Solution6();
//        System.out.println(solution6.rob(arr));
//        Solution7 solution7 = new Solution7();
//        System.out.println(solution7.canJump(new int[]{3,2,1,0,4}));
//        Solution8 solution8 = new Solution8();
//        System.out.println(solution8.search(new int[]{1,0,1,1,1}, 0));
//        Solution9 solution9 = new Solution9();
//        System.out.println(solution9.findMin(new int[]{13,15,17,11}));
//        Solution10 solution10 = new Solution10();
//        System.out.println(Arrays.toString(solution10.findRightInterval(new int[][]{{1,4},{2,3},{3,4}})));
//        Solution11 solution11 = new Solution11();
//        System.out.println(solution11.reachNumber(-3));//** very importent concept.
//        Solution12 solution12 = new Solution12();
//        System.out.println(solution12.maxValue(6,1,10));// good question
//        Solution13 solution13 = new Solution13();
//        System.out.println(solution13.minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));
//        Solution14 solution14 = new Solution14();
//        System.out.println(solution14.minAbsoluteSumDiff(new int[] {1,7,5}, new int[] {2,3,5}));
//        Solution15 solution15 = new Solution15();
//        System.out.println(solution15.maxFrequency(new int[]{3,9,6},2));
//        Solution16 solution16 = new Solution16();
////        System.out.println(solution16.shipWithinDays(new int[]{1,2,3,1,1},4));
//          Solution17 sol = new Solution17();
//          System.out.println(sol.thirdMax(new int[] {-1,-2,-3,-4}));
//          Solution18 sol2 = new Solution18();
//        System.out.println(Arrays.toString(sol2.sortArrayByParityII(new int[]{648,831,560,986,192,424,997,829,897,843})));
//        Solution19 sol3 = new Solution19();
//        System.out.println(sol3.largestPerimeter(new int[]{1,2,1,10}));
        //Solution20 sol4 = new Solution20();
//        System.out.println(Arrays.deepToString(sol4.allCellsDistOrder(2,2,0,1)));
        //System.out.println(sol4.allCellsDistOrder(2,2,0,1));
        //System.out.println(Arrays.deepToString(sol4.allCellsDistOrder1(2,2,0,1)));
//        Solution21 sol3 = new Solution21();
//        System.out.println(sol3.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
//        Solution22 sol2 = new Solution22();
//        System.out.println(Arrays.toString(sol2.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1})));
//        Solution23 sol3 = new Solution23();
//        System.out.println(sol3.longestPalindrome("abccccdd"));
//        Solution24 sol24 = new Solution24();
//        System.out.println(sol24.specialArray(new int[]{3,5}));
//        Solution25 sol25 = new Solution25();
//        System.out.println(sol25.longestKSubstr("aabacbebebe",3));
//        Solution26 sol26 = new Solution26();
//        System.out.println(sol26.threeSumClosest(new int[]{-1,2,1,-4},1));
//        Solution27 sol27 = new Solution27();
//        System.out.println(sol27.largestNumber(new int[]{3,30,34,5,9}));
//        Solution28 sol28 = new Solution28();
//        System.out.println(Arrays.deepToString(sol28.merge(new int[][]{{1,4},{0,2},{3,5}})));
//        Solution29 sol29 = new Solution29();
//        System.out.println(sol29.totalFruit(new int[]{0,1,2,2}));
//        Solution30 sol30 = new Solution30();
//        System.out.println(sol30.interpret("G()(al)"));
//        Solution31 sol31 = new Solution31();
//     System.out.println(sol31.reverseWords("Let's take LeetCode contest"));
//        Solution32 solution32 = new Solution32();
//        System.out.println(solution32.isLongPressedName( "alex","aaleex"));
//        System.out.println(solution32.isLongPressedName( "saeed","ssaaedd"));
//        System.out.println(solution32.isLongPressedName( "rick","kric"));
//        Solution33 solution33 = new Solution33();
//        System.out.println(solution33.validPalindrome("deeee"));
//        Solution34 s = new Solution34();
//        System.out.println(s.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
//        Solution35 s = new Solution35();
//        System.out.println(s.romanToInt("MCMXCIV"));
//        Solution36 s = new Solution36();
//        System.out.println(s.isValid("()[]{}"));
//        Solution37 sol = new Solution37();
//        System.out.println(sol.canJump(new int[]{3,0,8,2,0,0,1}));
//        Solution38 sol = new Solution38();
//        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3},2)));
//        Solution39 sol = new Solution39();
//        System.out.println(sol.numWays("1101100101"));
//        Solution40 sol = new Solution40();
//        System.out.println(Arrays.toString(sol.productExceptSelf(new int[]{1,2,3,4})));
//        Solution41 solution = new Solution41();
//        System.out.println(solution.longestConsecutive(new int[]{1,0,1,2}));
//        Solution42 solution = new Solution42();
//        System.out.println(solution.canTransform("RXXLRXRXL","XRLXXRRLX"));
//        Solution43 s = new Solution43();
//        System.out.println(s.nextGreaterElement(5321));
//        Solution44 s = new Solution44();
//        System.out.println(s.maximumRemovals("a","ab",new int[]{3,1,0}));
//        Solution45 s = new Solution45();
//        System.out.println(s.canTransform("X","L"));
//        Solution46 solution = new Solution46();
//        System.out.println(solution.trap(new int[]{4,2,0,3,2,5}));
//        Solution47 sol = new Solution47();
//        System.out.println(sol.characterReplacement("AABABBA",1));
//        Solution48 sol = new Solution48();
//        System.out.println(sol.checkInclusion("ab", "eidbaooo"));
//        Solution49 solution = new Solution49();
//        System.out.println(solution.generateParenthesis(2));
//        Solution50 solution50 = new Solution50();
//        System.out.println(solution50.combinationSum(new int[]{2,3,6,7}, 7));
//        Solution51 obj = new Solution51();
//        System.out.println(obj.minWindow("ADOBECODEBANC","ABC"));
//        Solution52 s = new Solution52();
//        System.out.println(s.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
//        Solution53 sol = new Solution53();
//        System.out.println(sol.threeSum(new int[]{-100,-70,-60,110,120,130,160}));
//        Solution54 solution54 = new Solution54();
//        System.out.println(solution54.minimumRecolors("WWWWBBBBBWWBWWWBWBWWWWWBWWBWWBBBBBWWWBWBWBBB",35));
//        Solution55  sol = new Solution55();
//        System.out.println(sol.findPages(new int[] {15, 10, 19, 10, 5, 18, 7}, 5));
        Solution56 s = new Solution56();
        System.out.println(s.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));


    }
        public static int specialArray(int[] nums) {
            int x = nums.length;
        int count = 0;
        for(int i = x; i >= 0; i--){
            for(int j = 0; j < x; j++){
                if(i <= nums[j])
                    count++;
            }
            if(count == i)
                return i;
            count = 0;
        }
        return -1;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []arr = new int [m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }
        k = 0;
        while(k < m + n){
            nums1[k] = arr[k];
            k++;
        }
    }
        public static int thirdMax(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int x : nums)
                set.add(x);
            List<Integer> list = new ArrayList<>(set);
            int max3 = Integer.MIN_VALUE;
            if(list.size() < 3) {
                for (int i : list)
                    max3 = Math.max(max3, i);
                return max3;
            }
            else{
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i) > 0 && list.get(i) < list.size() && list.get(i) != list.get(list.get(i) - 1)){
                        int temp = list.get(i);
                        list.set(i, list.get(list.get(i) - 1));
                        list.set(list.get(i)-1,temp);
                    }
                }
            }
            return list.get(list.size() - 3);
        }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, k = i + 1;
        while(i < nums.length){
            while(k < j){
                int sum = nums[i] + nums[k] + nums[j];
                if( sum > 0){
                    j--;
                }
                else if(sum < 0){
                    k++;
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    set.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    k++;
                    j--;
                }
            }
            i++;
            k = i+1;
            j = nums.length-1;
        }
        return new ArrayList<>(set);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        return rightDown(matrix,0,0,list,lists);
    }
    public static List<Integer> rightDown(int[][] matrix , int i, int j,List<Integer> list, List<List<Integer>> lists) {
        while(j < matrix[i].length && !lists.contains(new ArrayList<>(Arrays.asList(i,j)))){
            lists.add(new ArrayList<>(Arrays.asList(i,j)));
            list.add(matrix[i][j]);
            j++;
        }
        j = j - 1;
        if(i+1 < matrix.length && !lists.contains(new ArrayList<>(Arrays.asList(++i,j)))){
            return downLeft(matrix, i, j, list, lists);
        }
        return list;
    }
    public static List<Integer> downLeft(int[][] matrix, int i, int j,List<Integer> list, List<List<Integer>> lists) {
        while(i < matrix.length && !lists.contains(new ArrayList<>(Arrays.asList(i,j)))){
            lists.add(new ArrayList<>(Arrays.asList(i,j)));
            list.add(matrix[i][j]);
            i++;
        }
        i = i - 1;
        if(j - 1 >= 0 && !lists.contains(new ArrayList<>(Arrays.asList(i,--j)))){
            return leftUp(matrix, i, j, list, lists);
        }
        return list;
    }
    public static List<Integer> leftUp(int[][] matrix, int i, int j,List<Integer> list, List<List<Integer>> lists) {
        while(j >=0 && !lists.contains(new ArrayList<>(Arrays.asList(i,j)))){
            lists.add(new ArrayList<>(Arrays.asList(i,j)));
            list.add(matrix[i][j]);
            j--;
        }
        j = j + 1;
        if(i - 1 >= 0 && !lists.contains(new ArrayList<>(Arrays.asList(--i,j)))){
            return upRight(matrix, i, j, list, lists);
        }
        return list;
    }
    public static List<Integer> upRight(int[][] matrix, int i, int j,List<Integer> list, List<List<Integer>> lists) {
        while(i >=0 && !lists.contains(new ArrayList<>(Arrays.asList(i,j)))){
            lists.add(new ArrayList<>(Arrays.asList(i,j)));
            list.add(matrix[i][j]);
            i--;
        }
        i = i + 1;
        if(j + 1 < matrix[i].length && !lists.contains(new ArrayList<>(Arrays.asList(i,++j)))){
            return rightDown(matrix, i, j, list,lists);
        }
        return list;
    }
    public static int[][] generateMatrix(int n){
        int[][] m = new int[n][n];
        int top = 0,left = 0;
        int down = n - 1,right = n - 1;
        int r = 1;
        while(top <= down && left <= right){
            for(int i = top ; i <= right; i++){
                m[top][i] = r++;
            }
            top++;
            for(int i = top; i <= down; i++){
                m[i][right] = r++;
            }
            right--;
            for(int i = right; i >= left; i--){
                m[down][i] = r++;
            }
            down--;
            for(int i = down; i >= top; i--){
                m[i][left] = r++;
            }
            left++;
        }
        return m;
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] m = new int[rows*cols][2];
        int p = 1;
        int r = 0;
        m[0][0] = rStart;
        m[0][1] = cStart;
        boolean b = true;
        while(b){
            b = false;
            r++;
            for(int i = 0; i < r; i++){//right
                cStart++;
                if((rStart >=0 && rStart<= rows-1) && (cStart >= 0 && cStart <= cols - 1)){
                    m[p][0] = rStart;
                    m[p][1] = cStart;
                    p++;
                    b = true;
                }
            }
            for(int i = 0; i < r; i++){//down
                rStart++;
                if((rStart >=0 && rStart<= rows-1) && (cStart >= 0 && cStart <= cols - 1)){
                    m[p][0] = rStart;
                    m[p][1] = cStart;
                    p++;
                    b = true;
                }
            }
            r++;
            for(int i = 0; i < r; i++){//left
                cStart--;
                if((rStart >=0 && rStart<= rows-1) && (cStart >= 0 && cStart <= cols - 1)){
                    m[p][0] = rStart;
                    m[p][1] = cStart;
                    p++;
                    b = true;
                }
            }
            for(int i = 0; i < r; i++){//up
                rStart--;
                if((rStart >=0 && rStart<= rows-1) && (cStart >= 0 && cStart <= cols - 1)){
                    m[p][0] = rStart;
                    m[p][1] = cStart;
                    p++;
                    b = true;
                }
            }
        }
        return m;
    }
}

