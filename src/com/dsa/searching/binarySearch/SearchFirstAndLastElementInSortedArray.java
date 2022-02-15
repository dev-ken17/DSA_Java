package com.dsa.searching.binarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class SearchFirstAndLastElementInSortedArray {
    public static void main(String[] args){
        int[] arr = {6,7,7,7,7,8,8,9};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }


    private static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        if(ans[0] != -1) {
            ans[1] = end;
        }

        return ans;
    }

    private static int search(int[] arr, int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if( target > arr[mid]){
                start = mid + 1;
            }
            else{
                //potential ans
                ans = mid;
                if(startIndex){       //look whether condition matches to left of mid
                    end = mid - 1;
                }else{
                    start = mid + 1;  //look whether condition matches to right of mid
                }
            }
        }
        return ans;
    }
}
