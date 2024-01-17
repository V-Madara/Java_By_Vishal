import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of List 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter the Size of List 2: ");
        int s2 = sc.nextInt();
        sc.nextLine();
        List <String> l1 = new ArrayList<>();
        List <String> l2 = new ArrayList<>();
        System.out.println("Enter the Elements in List 1 -->");

        for(int i =0;i<s1 ; i++){
            System.out.print("Enter the Element: ");
            l1.add(sc.nextLine());
        }
        System.out.println("Enter the Elements in List 2 -->");

        for(int i =0;i<s2; i++){
            System.out.print("Enter the Element: ");
            l2.add(sc.nextLine());
        }
        System.out.println("List 1 --> "+l1);
        System.out.println("List 2 --> "+l2);
        // for(int i =0;i<s2;i++){
        //     l1.add(l2.get(i));
        // }
        // System.out.println("Merged List --> "+l1);
        sc.close();
        List<String> mergedList = new ArrayList<>(l1);
        mergedList.addAll(l2);
        System.out.println(mergedList);
    }
}
