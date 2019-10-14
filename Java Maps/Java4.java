package com.company;

import java.util.*;

public class Java4 {
   // Write a Java program to sort a given array list
   static TreeMap<Integer,String> sorter;
    public static void main(String[] args) {
        String a = null;
        int i = 0,j=6;
        sorter = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            i++;
            System.out.print("Enter " + i +" Value: ");
            a = sc.next();
            sorter.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : sorter.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }
        sorter.putAll(sorter);
        System.out.println("\nSorted String: ");
        for(Map.Entry<Integer,String> entry : sorter.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }


        sc.close();


    }
}