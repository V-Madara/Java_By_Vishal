import java.util.Scanner;

class Pelindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next().toUpperCase();
        boolean a = true;
        for(int i =0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                a = false;
                break;
            }
        }
        if(a){
            System.out.println(str+" is a Pelindome Number..!!");
        } else {
            System.out.println(str + " is not a Pelindrome Number..!!");
        }
        sc.close();
    }
    
}
