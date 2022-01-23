package com.dsa.basics;

public class IsPrime {
    public static void main(String[] args){
        for(int i=0; i<=30; i++){
            boolean ans = isPrime(i);
            if(ans) {
                System.out.println("num " + i + " is prime");
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
