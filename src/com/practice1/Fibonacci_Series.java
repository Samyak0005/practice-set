package com.practice1;

import java.util.Scanner;

//0 1 1 2 3 5 8 13
public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " ");
        for (int i = 1; i < n; i++) {

            n3 = n2 + n1;
            n2 = n1;
            n1 = n3;
            System.out.print(n3 + " ");
        }
    }
}
