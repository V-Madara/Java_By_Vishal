import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for(int i = 0; i<size;i++){
            System.out.print("Enter Element: ");
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        
        int temp ;
        for(int i =0,j=size-1;i<size/2;i++,j--){
            temp = ar[i];
            ar[i] =ar[j];
            ar[j] = temp;
        }
        System.out.println(Arrays.toString(ar));
        sc.close();
    }
}
