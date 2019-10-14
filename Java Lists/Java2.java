import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java2 {
    //Write a Java program to retrieve an element (at a specified index) from a given array list.
    static List<Integer> retrow;
    public static void main(String[] args) {
        int a = 0,j=6;
        retrow = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            retrow.add(0,a);
            j--;
        }while(j>0);
        for(int i:retrow){
            System.out.print(i +" ");
        }
        boolean isValid = true;
        do{
            int index = 0,retrieve = 0;
            System.out.print("\nEnter index to fetch: ");
            index = sc.nextInt();
            try{
                retrieve = retrow.get(index);
                System.out.println(retrieve + " is the retrieved number");
                isValid = false;
            }catch (Exception e){
                System.out.println("Please enter valid value");
            }
        }while(isValid);

        sc.close();


    }
}
