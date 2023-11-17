import java.util.Scanner;
public class Merger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();

        String s1,s2;
        s1 = ""+n1;
        s2 = ""+n2;
        long merg = Long.parseLong(s1+s2);
        System.out.println("Merged Number: "+merg);
    }
}
