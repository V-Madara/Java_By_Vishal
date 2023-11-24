import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of element: ");
        int x = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i =0;i<x;i++){
            System.out.print("Enter the Number: ");
            ll.add(sc.nextInt());

        }
            
            System.out.println(ll);
            
            LinkedList<Integer> ll1 = new LinkedList<>();
            
            ll.descendingIterator().forEachRemaining(ll1::add);
            
            System.out.println(ll1);
        sc.close();
    }
}
