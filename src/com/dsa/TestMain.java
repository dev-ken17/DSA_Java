package com.dsa;

public class TestMain {
    static int x = 90;
    public static void main(String[] args) {
	// write your code here
        System.out.println(x);
        x =70;  //shadowing
        System.out.println("test " + x);

        switch (x){
            case 70:
                System.out.println("value is below 80");
                break;
            case 90:
                System.out.println("value is above 90");
                break;
            default:
                System.out.println("Value not in range");
        }
    }
}
