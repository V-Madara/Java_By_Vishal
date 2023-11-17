import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = sc.nextInt();
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("Printing N1: "+n1 + " and N2: "+n2);
        sc.close();
    }
}
