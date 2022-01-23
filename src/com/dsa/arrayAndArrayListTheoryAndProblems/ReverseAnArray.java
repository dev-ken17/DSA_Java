package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
