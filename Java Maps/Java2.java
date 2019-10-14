package com.company;

import java.util.*;

public class Java2 {
    //Write a Java program to retrieve an element (at a specified index) from a given array list.
    static TreeMap<Integer,String> retrow;
    public static void main(String[] args) {
        String a = null;
        int i = 0,j=6;
        retrow = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Value: ");
            a = sc.next();
            i++;
            retrow.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : retrow.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }
        boolean isValid = true;
        do{
            int index = 0;
            String retrieve = null;
            System.out.print("\nEnter index to fetch: ");
            index = sc.nextInt();
            try{
                retrieve = retrow.get(index);
                System.out.println(retrieve + " is the retrieved value");
                isValid = false;
            }catch (Exception e){
                System.out.println("Please enter valid value");
            }
        }while(isValid);

        sc.close();


    }
}
