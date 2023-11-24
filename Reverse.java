import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        /*
        String str = sc.nextLine(),nstr="";
        for(int i =0;i<str.length();i++){
            nstr = str.charAt(i)+nstr;
        }
        System.out.println("Reversed String: "+nstr);
        sc.close();
        */
        String str = sc.nextLine();
        System.out.println(reverse(str));
        sc.close();



    }

    public static String reverse (String in){
    StringBuilder out = new StringBuilder();
    char ch[] = in.toCharArray();
    for(int i = ch.length-1;i>=0;i--){
        out.append(ch[i]);
    }
    return out.toString();
    }
    
}
