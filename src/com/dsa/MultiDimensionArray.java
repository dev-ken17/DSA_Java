package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args){

        int[][] arr1 = new int[3][2];
        // columns need not be specified, no of row is mandatory
        // because individual array can vary in size

        Scanner input = new Scanner(System.in);

        /* array.length gives count of number of rows **/

        for(int i =0; i < arr1.length; i++){
            for (int j=0; j < arr1[i].length; j++){
                arr1[i][j] = input.nextInt();
            }
        }


        //printing new element for each new line
        for(int row =0; row < arr1.length; row++){
            for (int col=0; col < arr1[row].length; col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        //print array for every row
        for(int row =0; row < arr1.length; row++){
            System.out.println(Arrays.toString(arr1[row]));
        }

        //enhanced for
        for(int[] a : arr1 ){
            System.out.println(Arrays.toString(a));
        }

    }
}
