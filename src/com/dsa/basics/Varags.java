package com.dsa.basics;

import java.util.Arrays;

public class Varags {
    public static void main(String[] args){

        printIntegers(1,2,3,4,5,6,7);
    }

    static void printIntegers(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
