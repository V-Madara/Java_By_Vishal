import java.util.Scanner;

public class RecusvieFibonacci {

    public static int Fibonacci(int count){
        if(count<= 1)
            return count;
            return Fibonacci(count-1)+Fibonacci(count-2);
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int x = sc.nextInt();
        for(int i = 0;i<x;i++){
            System.out.print(Fibonacci(i)+" , ");
        }
        sc.close();
    }
}
