import java.util.Scanner;

public class SpaceRemover {

    // public static String allSpace(String str){
    //     String nstr="";
    //     for(int i = 0;i<str.length();i++){
    //         if(!Character.isWhitespace(str.charAt(i)))
    //         nstr =nstr+str.charAt(i);
    //     }
    //     return nstr;
    // }

    static String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();
        char [] charArray = input.toCharArray();
        for(char c : charArray) {
            if(!Character.isWhitespace(c))
            output.append(c);
        }
        return output.toString();
    }

    public static String leadingTrailingSpace(String str){
        str.strip();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("1. ALL SPACES");
        System.out.println("2. ONLY LEADING AND TRELING SPACES");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        if(ch==1){
            // System.out.println(allSpace(str));
            System.out.println(removeWhiteSpaces(str));
        }else if(ch==2){
            System.out.println(leadingTrailingSpace(str));
        }else{
            System.out.println("INVALID CHOICE.!!");
        }
        sc.close();
    }
}