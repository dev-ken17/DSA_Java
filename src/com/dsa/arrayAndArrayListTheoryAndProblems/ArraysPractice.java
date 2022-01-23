package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        int[] rollnos = new int[5];
        //or
        int[] rollnos2 = {23,44,67,89};
        /** compile time    run-time
        dynamic memory allocation

        array object reference is stack memory
        array object is stored in heap memory

        Not a contiguous memory allocation
        heap allocation depends on JVM

        if no value is allocated all indexes have
        0 for integer array & null for string array **/

        for (int i: rollnos2){
            System.out.print(i + " ");
        }

        System.out.println(Arrays.toString(rollnos2));

    }
}
