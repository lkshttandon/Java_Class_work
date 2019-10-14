import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java6 {
   // Write a Java program to reverse a given array list
    static List<Integer> reverser;
    public static void main(String[] args) {
        int a = 0,j=6;
        reverser = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            reverser.add(0,a);
            j--;
        }while(j>0);
        for(int i:reverser){
            System.out.print(i +" ");
        }
        Collections.reverse(reverser);
        System.out.println("\nReversed String: ");
        for(int i:reverser){
            System.out.print(i +" ");
        }
	sc.close();
	}
}