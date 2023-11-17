import java.util.Scanner;

public class PelindromeAgain {
    // public static boolean pelinderomeCheck(String str){
    //     for(int i =0,j = str.length()-1;i<j;i++,j--){
    //         if(str.charAt(i)!=str.charAt(j)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean pelinderomeCheck(String str){
        int len = str.length();
        for(int i =0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().trim().toLowerCase();
        if(pelinderomeCheck(str)){
            System.out.println("It is Pelindromic String");
        }else{
            System.out.println("It is not a Pelindromic String");
        }
        sc.close();
    }
}
