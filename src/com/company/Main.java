package com.company;

import java.util.Scanner;
import java.util.*;
//kettle
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner number = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 8");
        int height = number.nextInt();
        while (height <= 1 || height >= 8) {
            System.out.println("Pick a valid number");
            height = number.nextInt();
        }
        System.out.println("Your number is " + height);
        for (int i = 1; i <= height; ++i){
            for (int j = 1; j <= height-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}