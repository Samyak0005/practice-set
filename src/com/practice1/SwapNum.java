package com.practice1;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = b;
        b = c;
        c = a;

        System.out.println("Print value of a =" + a + " Print value of b =" + b + " print value of c=" + c);

     /*   Step 1: Declare 2 variables x and y.
        Step 2: Read two numbers from keyboard.
                Step 3: Swap numbers.
//Apply addition and subtraction operations to swap the numbers.
        i. x=x+y
        ii. y=x-y
        iii. x=x-y
        Step 4: Print x and y values.*/



    }
}
