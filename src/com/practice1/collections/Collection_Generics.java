package com.practice1.collections;

import java.util.ArrayList;

public class Collection_Generics {
    public void MobileList() {

        ArrayList<String> MobileList = new ArrayList<>();

        MobileList.add("Samsung");
        MobileList.add("Nokia");
        MobileList.add("Oneplus");
        MobileList.add("Vivo");
        MobileList.add("Oppo");

        System.out.println("Printed Advance loop");

        for (String var : MobileList) {
            System.out.println(var);
        }
        System.out.println("Printed simple loop");
        for (int i = 0; i < MobileList.size(); i++) {
            System.out.println(MobileList.get(i));
        }

    }
     public ArrayList<Double> CreateDisplaySize(){

            ArrayList<Double> DisplaySize = new ArrayList<Double>();

            DisplaySize.add(76.8);
            DisplaySize.add(64.9);
            DisplaySize.add(90.6);

         for (Double var: DisplaySize){
             System.out.println(var);
         }

            return DisplaySize;
        }



    public static void main(String[] args) {
        Collection_Generics obj = new Collection_Generics();
        obj.MobileList();
        ArrayList<Double> DisplaySize=obj.CreateDisplaySize();
        for (Double var: DisplaySize){
            System.out.println(var);
        }

        for (int i=0; i< DisplaySize.size(); i++){
            System.out.println(DisplaySize.get(i));
        }



    }
}
