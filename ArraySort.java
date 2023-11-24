import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    // public static int[] arraySort(int ar[]){
    //     int temp;
    //     for(int i = 0;i<ar.length;i++){
    //         for(int j =i+1;j<ar.length;j++){
    //             if(ar[j]<ar[i])
    //             {
    //                 temp = ar[j];
    //                 ar[j]=ar[i];
    //                 ar[i]=temp;
    //             }
    //         }
    //     }
    //     return ar;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int len = sc.nextInt();
        int ar[] = new int[len];
        for(int i =0;i<len;i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        sc.close();
        
        // ar = arraySort(ar);
        // for(int a :ar){
            //     System.out.print(a+" , ");
            // }
            
            
            /* Website Logic : It is amazing..!! */
                    Arrays.sort(ar);
                    System.out.println(Arrays.toString(ar));
    }
    
}
