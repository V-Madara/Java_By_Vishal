import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    
    public static int find(int ar[]){
        int x = 0,y=0;
        for(int a: ar){
            if(a>x){
                y=x;
                x=a;
            }
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int s = sc.nextInt();
        int ar[] = new int[s];
        for(int i =0;i<s;i++){
        System.out.print("Enter the Element: ");
        ar[i] =sc.nextInt();
        }
        System.out.println("Array is --> "+Arrays.toString(ar));
        System.out.println("Second Largest Number is : "+find(ar));
        sc.close();
    }
}
