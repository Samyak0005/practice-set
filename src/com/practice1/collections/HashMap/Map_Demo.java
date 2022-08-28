package com.practice1.collections.HashMap;

import java.util.HashMap;

public class Map_Demo {
    public HashMap<Integer,String> AddCityList(){

        HashMap<Integer,String> CityList = new HashMap<>();
        CityList.put(1,"Agra");
        CityList.put(2,"Delhi");
        CityList.put(3,"Firozabad");
        CityList.put(4,"Mumbai");
        CityList.put(5,"Tajnagri");

  //      System.out.println(CityList.get(1));

        return CityList;
    }

    public static void main(String[] args) {
        Map_Demo obj = new Map_Demo();
        HashMap<Integer,String> CityList = obj.AddCityList();

        for (Integer var: CityList.keySet()) {
            System.out.println(CityList.get(var));
        }
    }
}
