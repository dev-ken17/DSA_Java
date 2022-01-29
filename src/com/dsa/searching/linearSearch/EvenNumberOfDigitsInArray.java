package com.dsa.searching.linearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class EvenNumberOfDigitsInArray {
    public static void main(String[] args){
        int[] arr = {23,456,8,90,-34};

        System.out.println(findNumbers(arr));

    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int i : nums){
            if(even2(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int i){
        int count = 0;
        if(i == 0){
            return false;
        }
        if(i < 0){
            i *= -1;
        }
        //find number of digits
        while( i > 0){
            count++;
            i = i/10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }

    private static boolean even2(int i){
        int count = 0;
        if(i == 0){
            return false;
        }
        if(i < 0){
            i *= -1;
        }
        //find number of digits
        count = (int)Math.log10(i) + 1;
        if(count % 2 == 0){
            return true;
        }
        return false;

    }
}
