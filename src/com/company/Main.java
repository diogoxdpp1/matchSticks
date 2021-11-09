package com.company;

import java.util.Scanner;

public class Main {

    public static int getIntInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many matchstick houses do you want to make");
        return input.nextInt();
    }
    public static int calculation(){
        int finalnum = (((getIntInput() - 1)  * 5) + 6);
        return finalnum;
    }
    public static void main(String[] args) {
        System.out.println("You are going to need " + calculation() + " matchsticks");
    }
}