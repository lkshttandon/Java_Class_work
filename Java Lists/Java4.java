import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java4 {
   // Write a Java program to sort a given array list
    static List<Integer> sorter;
    public static void main(String[] args) {
        int a = 0,j=6;
        sorter = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            sorter.add(0,a);
            j--;
        }while(j>0);
        for(int i:sorter){
            System.out.print(i +" ");
        }
        Collections.sort(sorter);
        System.out.println("\nSorted String: ");
        for(int i:sorter){
            System.out.print(i +" ");
        }


        sc.close();


    }
}