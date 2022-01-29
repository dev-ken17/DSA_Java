package com.dsa.searching.binarySearch;

public class AmbiguousSortedArrayBinarySearch {
    public static void main(String[] args){

        int[] arrAsc = {4,7,9,10,11,15,17};
        int[] arrDesc = {17,15,11,10,9,7};

        int target = 15;

        System.out.println(binarySearch(arrDesc,target));
        System.out.println(binarySearch(arrAsc,target));
    }

    private static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean Asc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(Asc){
                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }

            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
