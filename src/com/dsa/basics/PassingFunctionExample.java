package com.dsa.basics;

import java.util.Arrays;

public class PassingFunctionExample {
    public static void main(String[] args){
        int[] arr = {3,4,5,7};

        System.out.println(Arrays.toString(arr));

        changeArr(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int[] arr){
        arr[0] = 90;
    }
}
