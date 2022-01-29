package com.dsa.searching.linearSearch;

/** https://leetcode.com/problems/richest-customer-wealth/ */
public class WealthInAccounts2DArray {
    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(accounts));

    }
    private static int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int maxWealth = 0;

        if(accounts.length == 0){
            return 0;
        }

        for(int row =0; row < accounts.length; row++){
            for(int col =0; col < accounts[row].length; col++){
                wealth[row] += accounts[row][col];
            }
            if(maxWealth < wealth[row]){
                maxWealth = wealth[row];
            }
        }

//        for(int i : wealth){
//            if(maxWealth < i){
//                maxWealth = i;
//            }
//        }
        return maxWealth;
    }
}
