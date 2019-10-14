package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Java7 {


    public static void main(String[] args)
    {
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<>();

        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4,"D");
        boolean isEqual = map1.equals(map2);
        System.out.println("\n"+ "Map1 and Map2: " + isEqual);
        isEqual = map1.equals(map3);
        System.out.println("Map1 and Map3: "+isEqual);
    }
}

