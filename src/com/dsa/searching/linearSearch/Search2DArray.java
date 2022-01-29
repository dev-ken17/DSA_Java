package com.dsa.searching.linearSearch;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},
                {4,5},
                {6,8,7}};

        int[][] arr1 = {};

        int target = 8;


        System.out.println(findElementIn2DArray(arr,target));
        System.out.println(Arrays.toString(findElementIn2DArrayRowAndColumn(arr,target)));
        System.out.println(findElementIn2DArray(arr1,target));
        System.out.println(Arrays.toString(findElementIn2DArrayRowAndColumn(arr1,target)));
    }

    private static boolean findElementIn2DArray(int[][] arr,int target){
        if(arr.length == 0){
            return false;
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] findElementIn2DArrayRowAndColumn(int[][] arr,int target){
        if(arr.length == 0){
            return new int[]{};
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{};
    }
}
