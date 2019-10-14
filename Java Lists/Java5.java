
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java5 {
   // Write a Java program to reverse a given array list
    static List<Integer> shuffler;
    public static void main(String[] args) {
        int a = 0,j=6;
        shuffler = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            shuffler.add(0,a);
            j--;
        }while(j>0);
        for(int i:shuffler){
            System.out.print(i +" ");
        }
        Collections.shuffle(shuffler);
        System.out.println("\nShuffled String: ");
        for(int i:shuffler){
            System.out.print(i +" ");
        }
	}
}