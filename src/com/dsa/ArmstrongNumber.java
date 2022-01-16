package com.dsa;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isArmstrongNum(n);
        if(ans){
            System.out.println("Num " + n + " is an armstrong number");
        }
        else {
            System.out.println("Num " + n + " not an armstrong number");
        }

    }

    static boolean isArmstrongNum(int n){
        int originalVal = n;
        int rem;
        int cube;
        int total =0;
        while (n!=0){
            rem = n % 10;
            cube = rem * rem * rem;
            total += cube;
            n = n/10;
        }
        return total == originalVal;
    }
}
