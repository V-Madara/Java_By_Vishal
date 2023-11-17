import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String cstr = sc.nextLine();
        // int c =0;
        // for(int i = 0;i<cstr.length();i++){
        //     cstr.toLowerCase();
        //     if(cstr.charAt(i)=='a'||cstr.charAt(i)=='e'||cstr.charAt(i)=='i'||cstr.charAt(i)=='o'||cstr.charAt(i)=='u'){
        //         c++;
        //     }
        // }
        // if(c>0){
        //     System.out.println("String Contains Vowels..!!");
        //     System.out.println("Number of vowels = "+c);
        // }else{
        //     System.out.println("String Does not contains any vowel..!!");
        // }

        System.out.println(stringContainsVowels(cstr));

        sc.close();
    }
    public static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
    
}
