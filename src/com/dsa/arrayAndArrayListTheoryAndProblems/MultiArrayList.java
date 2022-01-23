package com.dsa.arrayAndArrayListTheoryAndProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();

        for(int i=0; i<3 ; i++){
            arrlist.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
                arrlist.get(i).add(input.nextInt());
            }
        }

        System.out.println(arrlist);
    }
}
