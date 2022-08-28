package com.practice1;

import java.util.Scanner;
//Disadvantage there is dublicaion value more than 2 there is not to print
public class Array_Dublication {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int [] marks = {1,1,30,50,50};

        for (int i = 0; i< marks.length-1; i++){//0 to 5
            for (int j = i+1; j<marks.length; j++ ){// 1 to 5

                if(marks[i]==marks[j] && i!= j){//40==40 & 0!= 1 and 50 == 50 & 3!=4
                    System.out.println("print the Dublication  "+marks[i]);
                }
            }
        }

        

    }
}
