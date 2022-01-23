package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>(10);

//        arr1.add(11);
//        arr1.add(40);
//        arr1.add(128);
//        arr1.add(154);

        for(int i=0; i< 5; i++){
            arr1.add(input.nextInt());
        }

        for(int i=0; i< arr1.size(); i++){
            System.out.println(arr1.get(i));
        }

        System.out.println("=================");

        for(int i : arr1){
            System.out.println(i);
        }

        arr1.set(0,99);

        System.out.println(arr1);

    }
}
