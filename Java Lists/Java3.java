
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java3 {
    //Write a Java program to search an element in a array list.
    static List<Integer> searcher;
    public static void main(String[] args) {
        int a = 0,j=6;
        searcher = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            searcher.add(0,a);
            j--;
        }while(j>0);
        for(int i:searcher){
            System.out.print(i +" ");
        }
        boolean isValid = true;
        do{
            int index = 0,search = 0;
            System.out.print("\nEnter value to fetch: ");
            index = sc.nextInt();
            try{
                search = searcher.indexOf(index);
                System.out.println(index +" is found at [" + search + "] position");
                isValid = false;
            }catch (Exception e){
                System.out.println("Please enter valid value");
            }
        }while(isValid);

        sc.close();


    }
}
