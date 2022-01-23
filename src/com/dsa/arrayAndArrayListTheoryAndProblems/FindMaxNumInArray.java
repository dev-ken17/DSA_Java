package com.dsa.arrayAndArrayListTheoryAndProblems;

public class FindMaxNumInArray {
    public static void main(String[] args){
        int[] arr1 = {1,4,23,9,18};
        int[] arr2 = {};

        System.out.println(findMaxNumInArray(arr1));
        System.out.println(findMaxNumInArray(arr1,0,1));
        System.out.println(findMaxNumInArray(arr1,2,1));

        System.out.println(findMaxNumInArray(arr2));
        System.out.println(findMaxNumInArray(arr2,0,1));
    }

    private static int findMaxNumInArray(int[] arr1) {
        if(arr1.length == 0){
            return 0;
        }
        int max = 0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > arr1[max]){
                max = i;
            }
        }
        return arr1[max];
    }

    private static int findMaxNumInArray(int[] arr1,int start, int end) {
        if(arr1.length == 0){
            return 0;
        }
        if(end > start){
            return 0;
        }
        int max = 0;
        for(int i=start; i<end; i++){
            if(arr1[i] > arr1[max]){
                max = i;
            }
        }
        return arr1[max];
    }


}
