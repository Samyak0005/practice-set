package com.practice1;

import java.util.Scanner;

//101,1001,303
public class Palindrome_No {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int check, n1,n2=0;
  check=n;
  while(n>0){
      n1=n%10;
      n2=(n2*10)+n1;
      n = n/10;
  }
        if(check==n2){
          System.out.println("this is palindrome no");
        }else {
          System.out.println("this is not palindrome no");
        }

    }
}
