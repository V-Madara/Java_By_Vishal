import java.util.Scanner;
public class BinarySearch {

    public static int binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;
    
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
    
        if (low > high) {
            return -1;
        }
    
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int x = sc.nextInt();
        int ar[] = new int[x];
        for(int i =0;i<x;i++){
            System.out.print("Enter Element: ");
            ar[i] =sc.nextInt();
        }
        System.out.println("Enter the String to be found: ");
        int key = sc.nextInt();
        if(binarySearch(ar, 0, x, key)==-1){
            System.out.println("Key is not found..!!");
        }else{
            System.out.println("Key found found..!!");
        }
        sc.close();
    }
}
