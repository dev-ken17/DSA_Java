package com.dsa.searching;



public class StringSearch {
    public static void main(String[] args){

        String name = "Chelsea";
        char target = 'e';
        System.out.println(stringSearch(name,target));
        System.out.println(stringSearchForEach(name,target));
    }

    private static boolean stringSearch(String name, char target){
        if(name.length() == 0)
            return false;
        for(int i =0; i<name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    private static boolean stringSearchForEach(String name, char target){
        if(name.length() == 0)
            return false;
        for(char ch : name.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}
