package com.practice1;

import java.util.Scanner;

public class Sum_N_Natural_Num {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;

        for (int i = 0; i <= n; i++) {
            System.out.print(i+" + ");

            if (i==5){
                System.out.print("");
            }
            Sum = Sum + i;

        }
        System.out.println("="+Sum);
    }
}
