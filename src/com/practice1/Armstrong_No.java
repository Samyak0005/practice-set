package com.practice1;

import java.util.Scanner;

//153 = 1*1*1+5*5*5+3*3*3
public class Armstrong_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arm = sc.nextInt();
        int check,n1,n2 = 0;
        check = Arm;
        while(Arm>0){//153,15,1
            n1 = Arm%10; //3,5,1
            n2 = (n1*n1*n1)+n2;// 3*3*3+0=27,5*5*5+27=152,153
            Arm = Arm/10;//15,1,0
        }
        if (check== n2){
            System.out.println(n2+"  this is Armstrong value");
        }else{
            System.out.println(check+"  this is not an Armstrong value");
        }

    }
}
