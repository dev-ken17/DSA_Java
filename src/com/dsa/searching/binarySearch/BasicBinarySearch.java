package com.dsa.searching.binarySearch;

public class BasicBinarySearch {
    public static void main(String[] args){

        int[] arr = {3,5,8,9,12,45,78,89,91,94};
        int target = 91;

        System.out.println(binarySearch(arr,8));
    }

    private static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

}
