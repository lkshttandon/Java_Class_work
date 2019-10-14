package com.company;

import java.util.*;

public class Java5 {
   // Write a Java program to reverse a given array list
   static TreeMap<Integer,String>  shuffler;
    public static void main(String[] args) {
        String a = null;
        int i = 0,j=6;
        shuffler = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            i++;
            System.out.print("Enter " + i +" Value: ");
            a = sc.next();
            shuffler.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : shuffler.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }
        List keys = new ArrayList(shuffler.keySet());
        Collections.shuffle(keys);
        for (Object o : keys) {
            // Access keys/values in a random order
            shuffler.get(o);
        }

        System.out.println("\nShuffled String: ");
        for(Map.Entry<Integer,String> entry : shuffler.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }
	}
}