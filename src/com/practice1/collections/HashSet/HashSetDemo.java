package com.practice1.collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public HashSet<String> CreateCityList(){

        HashSet<String> CityList = new HashSet<>();
        CityList.add("Agra");
        CityList.add("Delhi");
        CityList.add("Mumbai");
        CityList.add("Firozabad");
        CityList.add("Agra");

        for (String var: CityList){
            System.out.println(var);
        }

        return CityList;
    }

    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        HashSet<String> CityList = obj.CreateCityList();

        System.out.println(CityList.size());

    }
}
