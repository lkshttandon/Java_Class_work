package com.company;

import java.util.*;

public class Java3 {
    //Write a Java program to search an element in a array list.
    static TreeMap<Integer,String> searcher;
    public static void main(String[] args) {
        String a = null;
        int i = 0,j=6;
        searcher = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            i++;
            System.out.print("Enter " + i +" Value: ");
            a = sc.next();
            searcher.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : searcher.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }
        boolean isValid = true;
        do{
            int index = 0;
            String search = null;
            System.out.print("\nEnter value to fetch: ");
            index = sc.nextInt();
            try{
                search = searcher.get(index);
                System.out.println(search +" is found at [" + index + "] position");
                isValid = false;
            }catch (Exception e){
                System.out.println("Please enter valid value");
            }
        }while(isValid);

        sc.close();


    }
}
