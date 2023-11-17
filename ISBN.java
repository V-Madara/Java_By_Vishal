import java.util.Scanner;
public class ISBN{
    public static void main(String madara[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT CODE: ");
        String str = sc.nextLine();
        if(str.length()!=10){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int sum =0;
        for(int i=10;i>=1;i--){
            if(i==1 && str.charAt(10-i)=='X'){
                sum = sum+10;
            }else{
                sum = sum+((int)str.charAt(10-i)-48)*i;
            }
        }
        System.out.println("OUTPUT: Sum = "+sum);
        if(sum%11==0){
            System.out.println("LEAVES NO REMAINDER - VALID ISBN CODE");
        }else{
            System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
        }
        sc.close();
    }
}