package com.dsa.searching.linearSearch;

public class MaxValueIn2DArray {
    public static void main(String[] args){
        int[][] arr = {{45,6,7},
                {6,89,23,76},
                {45,34}};

        System.out.println("Max value in 2D array : " + findMaxValueIn2DArray(arr));
        System.out.println("Max value in 2D array : " + findMaxValueIn2DArrayInEnhancedForLop(arr));
    }

    private static int findMaxValueIn2DArray(int[][] arr){

        if(arr.length == 0){
            return -1;
        }

        int max_value = Integer.MIN_VALUE;


        for(int row=0; row <  arr.length; row++){
            for (int col =0; col < arr[row].length; col++){
                if(max_value < arr[row][col])
                    max_value = arr[row][col];
            }
        }
        return max_value;

    }

    private static int findMaxValueIn2DArrayInEnhancedForLop(int[][] arr){

        if(arr.length == 0){
            return -1;
        }

        int max_value = Integer.MIN_VALUE;


        for(int[] row : arr){
            for (int element : row){
                if(max_value < element)
                    max_value = element;
            }
        }
        return max_value;

    }
}
