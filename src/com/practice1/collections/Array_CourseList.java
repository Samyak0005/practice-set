package com.practice1.collections;


import java.util.ArrayList;

public class Array_CourseList {
    public static void main(String[] args) {
//        //Collection_name var_Nam = new Collection_Name

        ArrayList couselist = new ArrayList();
        couselist.add("java");
        couselist.add("Spring Boot");
        couselist.add("python");
        couselist.add("Java8");
        couselist.add("webservice");

        System.out.println(couselist.get(0));
        System.out.println(couselist.get(1));

        System.out.println("simple loop");
        for (int i = 0; i<couselist.size(); i++){
            System.out.println(couselist.get(i));
        }

        System.out.println("Advance loop");
        for (Object var: couselist){
            System.out.println(var);
        }

    }
}