package com.practice1;

public class Check_Multiple_Main_method {

        public static void main(String name) {
            System.out.println(name);
        }
    public static void main(int age) {
        if(age>18){
            System.out.println("this is Eligible for voting");
        }
        else {
            System.out.println("this is not Eligible for voting");
        }
    }

    public static void main(String[] args) {
        Check_Multiple_Main_method obj = new Check_Multiple_Main_method();
obj.main(19);
obj.main("Samyak");
    }

}


