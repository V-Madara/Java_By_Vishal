import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a Number: ");
        int n = sc.nextInt();
        for(int i = 2;i<n;i++){
            if(n%i==0){
                System.out.println("Not a Prime Number..!!");
                System.exit(0);
            }
        }
        System.out.println("It is a Prime Number..!!");
        sc.close();
    }
}
