package com.practice1;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();//2
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();//3


        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println(a);
        System.out.println(b);
    }
}
