
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java1 {
    static List<Integer> addrow;
    public static void main(String[] args) {
        int a = 0,j=6;
        addrow = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter positive int: ");
            a = sc.nextInt();
            addrow.add(0,a);
            j--;
        }while(j>0);
        for(int i:addrow){
            System.out.print(i+ " ");
        }


    }
}
