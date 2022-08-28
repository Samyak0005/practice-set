package com.practice1;

import java.util.Scanner;

//101,1001,303,121
// 101 = 0*10 +
public class Palindrome_No {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();
        int check, n1, n2 = 0;
        check = Palindrome;
        while (Palindrome > 0) {
            n1 = Palindrome % 10;
            n2 = (n2 * 10) + n1;
            Palindrome = Palindrome / 10;
        }
        if (check == n2) {
            System.out.println( check+"   This value is Palindrome");
        } else {
            System.out.println(check+  "  this is not an Palindrome  ");
        }
    }
}
