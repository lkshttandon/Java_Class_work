
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java7 {

    public static void main(String[] args)
    {
        List<String> List1 = new ArrayList<>();
        List<String> List2 = new ArrayList<>();
        List1.add("A");
        List1.add("B");
        List1.add("C");
        List2.add("A");
        List2.add("B");
        List2.add("D");
        List1.add("E");
        Collections.sort(List1);
        Collections.sort(List2);
        ArrayList<String> List3 = new ArrayList<>();
        List3.add("A");
        List3.add("B");
        List3.add("C");
        List3.add("E");
        System.out.print("List1: ");
        for(String a:List1) {
            System.out.print(a + " ");
        }
        System.out.print("\nList2: ");
        for(String a:List2) {
            System.out.print(a + " ");
        }
        System.out.print("\nList3: ");
        for(String a:List3) {
            System.out.print(a + " ");
        }
        boolean isEqual = List1.equals(List2);
        System.out.println("\n"+ "List1 and List2: " + isEqual);
        isEqual = List1.equals(List3);
        System.out.println("List1 and List3: "+isEqual);
    }
}

