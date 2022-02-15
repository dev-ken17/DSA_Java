package com.dsa.searching.binarySearch;

public class BinarySearchCeiling {
    public static void main(String[] args){

        int[] arr = {3,4,7,9,14,16,17,18};
        int target = 20;

        System.out.println(ceilingOfNumber(arr,target));
    }

    // > target but minimum value in the array
    private static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //target is greater than the largest element
        if(target >= arr[end]){  // or target <= start
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if( target < arr[mid]){
                end = mid - 1;
            }
            else if( target > arr[mid]){
                start = mid + 1;
            }else {
                return target;
            }
        }
        return start;
        // if finding floor of number, return end
        // intuition when while loop breaks => end [ans] start
    }
}
