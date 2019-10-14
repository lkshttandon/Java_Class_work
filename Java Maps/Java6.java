package com.company;

import java.util.*;

public class Java6 {
   // Write a Java program to reverse a given array list
   static TreeMap<Integer,String> reverser;
    public static void main(String[] args) {
        String a = null;
        int i = 0,j=6;
        reverser =  new TreeMap<>(Collections.reverseOrder());;
        Scanner sc = new Scanner(System.in);
        do {
            i++;
            System.out.print("Enter " + i +" Value: ");
            a = sc.next();
            reverser.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : reverser.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
//        }
//        Collections.reverseOrder(reverser);
//        System.out.println("\nReversed String: ");
//        for(int i:reverser){
//            System.out.print(i +" ");
//        }
	sc.close();
	}
}
}