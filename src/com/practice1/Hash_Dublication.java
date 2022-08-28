package com.practice1;

import java.util.HashSet;

public class Hash_Dublication {
    public static void main(String[] args) {
        int [] marks= {40,40,40,30,50,50,40,40};

        //classname objname = new classname

        HashSet<Integer> getmarks = new HashSet();
        for (int n: marks){

          //  boolean flag = getmarks.add(n);
            if (getmarks.add(n)  == false){
                System.out.println("this is Dublicated value  "+ n);
            }


        }

    }
}
