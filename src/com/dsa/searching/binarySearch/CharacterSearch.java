package com.dsa.searching.binarySearch;

public class CharacterSearch {
    public static void main(String[] args){
        char[] arr = {'c','d','j','l'};

        System.out.println(nextGreatestLetter(arr,'k'));
    }


    // time complexity -> log(n)
    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else{                   //else if condition --
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
