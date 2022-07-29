package com.practice1;

import java.util.HashSet;

public class Hashset_Dublication {

    public static void main(String[] args) {

       int [] marks = {20,40,30,80,50,30,37,40};

        HashSet<Integer> DUBLICATION = new HashSet<>();
//        DUBLICATION.add(20);
//        DUBLICATION.add(40);
//        DUBLICATION.add(30);
//        DUBLICATION.add(80);
//        DUBLICATION.add(50);
//        DUBLICATION.add(30);
//        DUBLICATION.add(37);
//        DUBLICATION.add(40);
//
//        for (int a : DUBLICATION){
//            System.out.println(a);
//        }
//

        for (int a: marks){
            if (DUBLICATION.add(a)== false){// we know that hashset stored unique value can't stored dublicated value
                //so false show any dublicated value in the array
                System.out.println("this is Dublication no : "+a);
            }
        }

    }
}
