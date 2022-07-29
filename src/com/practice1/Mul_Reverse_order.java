package com.practice1;

import java.util.Scanner;

public class Mul_Reverse_order {
    public static void main(String[] args){

        System.out.println("Enter the NUM");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1 ;
        for(int i = n; i>0; i--) {
            System.out.print(i+" ");
            mul = i*mul;
            System.out.println(mul);
        }

    }
}
