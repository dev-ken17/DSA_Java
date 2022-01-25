package com.dsa.searching;

public class FindMinValueInArray {
    public static void main(String[] args ){
        int[] arr = {6,4,8,9,2};

        System.out.println(minValueInArray(arr));

    }

    private static int minValueInArray(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int i: arr){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
