import java.util.Scanner;
public class Factorial {

    // public static int fact(int n){
    //     int f = 1;
    //     for(int i = 1;i<=n;i++){
    //         f=f*i;
    //     }
    //     return f;
    // }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        // System.out.println("Factorial of Number is: "+fact(x));
        System.out.println("Factorial of Number is: "+factorial(x));
        sc.close();
    }
}
