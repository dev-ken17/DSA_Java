package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapNumbersInArrayList {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(4);
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);
        arr1.add(0);

        System.out.println(arr1);

        swap(arr1,1,3);

        System.out.println(arr1);

    }

    private static void swap(ArrayList<Integer> arr1 ,int index1, int index2){
      int temp = arr1.get(index1);
      arr1.set(index1, arr1.get(index2));
      arr1.set(index2, temp);
    }
}
