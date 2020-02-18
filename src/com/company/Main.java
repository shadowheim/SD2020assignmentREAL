package com.company;

public class Main {

    public static void main(String[] args) {
	// remember to make a check on input
        System.out.println(args[0]);
        int num = Integer.parseInt(args[0]);
        for (int i = 1; i <= 10; i++) {
            int result = i*num;
            System.out.println(num + " x " + "" + args[0]);
        }
    }
}
