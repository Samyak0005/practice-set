package com.practice1;

import java.util.Scanner;
//153 = 1*1*1+5*5*5+3*3*3
public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check,n1,n2=0;
        check = n;
        while (n>0){
            n1 = n%10;
            n2 = (n1*n1*n1)+n2;
            n = n/10;
        }
        if(check==n2){
            System.out.println("this is Armstrong no");
        }else {
            System.out.println("this is not Armstrong no");
        }

    }


}
