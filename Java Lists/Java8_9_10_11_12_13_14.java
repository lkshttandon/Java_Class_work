
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Java8_9_10_11_12_13_14 {
    //Write a Java program to append the specified element to the end of a linked list
    //Write a Java program to iterate through all elements in a linked list starting at the specified position
    //Write a Java program to iterate a linked list in reverse order.
    //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    //Write a Java program to retrieve but does not remove, the last element of a linked list.
    //Write a Java program to convert a linked list to array list.
    // Write a Java program to remove and return the first element of a linked list


        public static void main(String[] args) {
            LinkedList<String> l_list = new LinkedList<>();
            //Write a Java program to append the specified element to the end of a linked list
            l_list.add("Apple");
            l_list.add("Banana");
            l_list.add("Mango");
            l_list.add("Grape");
            l_list.add("Strawberry");
            l_list.add("PineApple");

            System.out.println("The linked list: " + l_list);

            //Write a Java program to iterate through all elements in a linked list starting at the specified position
            Iterator p = l_list.listIterator(1);
            // print list from second position
            System.out.println("\nList Iterator:");
            while (p.hasNext()) {
                System.out.print(p.next() + " ");
            }
            //Write a Java program to iterate a linked list in reverse order.
            Iterator it = l_list.descendingIterator();

            // Print list elements in reverse order
            System.out.println("\nReverse Iterator");
            while (it.hasNext()) {
                System.out.print(it.next()+ " ");
            }

            //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
            // Find first element of the List
            Object first_element = l_list.getFirst();
            System.out.println("\n\nFirst Element is: "+first_element);

            // Find last element of the List
            Object last_element = l_list.getLast();
            System.out.println("Last Element is: "+last_element);

            //Write a Java program to retrieve but does not remove, the last element of a linked list.
            //Last element in the Linked list
            String x = l_list.peekLast();
            System.out.println("\nLast element in the list without removing it : " + x);

            // Write a Java program to remove and return the first element of a linked list
            System.out.println("Removed element: "+l_list.pop());
            System.out.println("Linked list after pop operation: "+l_list);

            //Write a Java program to convert a linked list to array list.
            ArrayList<String> list = new ArrayList<>(l_list);
            System.out.println("\nThe Linked List is now Array List");
            System.out.print("Array List: ");
            for (String str : list){
                System.out.print(str + " ");
            }

        }
}
