package com.practice1;

import java.util.Scanner;

// 2 4 6 8 10 12
public class Even_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;
        for (int i = 1; i<=n; i++){
            if (i%2==0){
                System.out.println("even "+i);
            }


        }

    }
}
