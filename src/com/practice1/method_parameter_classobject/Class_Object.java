package com.practice1.method_parameter_classobject;

public class Class_Object {

    int Roll_no = 18;
    String name = "Ritik";
    String Result = "one person are important in the life";


    public static void main(String[] args) {
        Class_Object obj = new Class_Object();
        Class_Object obj2 = new Class_Object();
        System.out.println(obj2.name);
        obj.name= "samyak";
        System.out.println(obj.name);
        System.out.println(obj.Result);
        obj2.Roll_no = 07;
        System.out.println(obj2.Roll_no);
    }
}
