package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.Arrays;

public class NoColFixedSizeArray {
    public static void main(String[] args){

        int[][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
