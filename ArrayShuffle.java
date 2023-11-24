import java.util.*;
public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int s = sc.nextInt();
        int ar[] = new int[s];
        for(int i =0;i<s;i++){
            System.out.print("Enter the Element: ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Original Array is --> "+Arrays.toString(ar));
        
        Random rn = new Random();

        for(int i = 0;i<s;i++){
            int random = rn.nextInt(0,s);
            int temp = ar[i];
            ar[i] = ar[random];
            ar[random] = temp; 
        }
        System.out.println("Suffled Array is --> "+Arrays.toString(ar));
        sc.close();
    }
}
