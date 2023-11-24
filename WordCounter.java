import java.util.Scanner;
public class WordCounter {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine().trim();
        long c=1,i;
        for(i=1;i<=str.length();i++) {
            if(Character.isWhitespace(str.charAt((int)i-1))) {
                c++;
            }
        }
        System.out.println("The number of Characters are: "+i);
        System.out.println("The number of Words are: "+c);
        sc.close();
    }
   } 
}
