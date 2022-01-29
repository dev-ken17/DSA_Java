package com.dsa.searching.linearSearch;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {1,6,3,5,14,19};

        int target = 3;
        //search in range of index 1 to 4
        System.out.println(linearSearchInRange(arr,target,1,4));

    }

    private static int linearSearchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }


}
