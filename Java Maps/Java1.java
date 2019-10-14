package com.company;

import java.util.*;

public class Java1 {
    static TreeMap<Integer,String> addrow;
    public static void main(String[] args) {
        int j=6,i=0;
        String a =null;
        addrow = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Value: ");
            a = sc.next();
            i++;
            addrow.put(i,a);
            j--;
        }while(j>0);
        for(Map.Entry<Integer,String> entry : addrow.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue() + " ");
        }


    }
}
