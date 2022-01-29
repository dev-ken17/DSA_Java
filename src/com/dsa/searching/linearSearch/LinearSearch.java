package com.dsa.searching.linearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8};

        //find if 7 is present in array
        int num = 7;
        int value = linearSearch(arr,num);
        System.out.println("Number found at position " + value);

    }

    static int linearSearch(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }
        for(int i : arr){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    //for returning elements in the array, constants like Interger.MAX_VALUE can be used
}
