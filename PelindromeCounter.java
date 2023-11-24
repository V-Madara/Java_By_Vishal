import java.util.*;
public class PelindromeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine().toUpperCase().trim();
        if(str.charAt(str.length()-1)!='.'&&str.charAt(str.length()-1)!=','&&str.charAt(str.length()-1)!='#'&&str.charAt(str.length()-1)!='#'){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        str = str.substring(0, str.length()-1).trim();
        StringTokenizer stz = new StringTokenizer(str);
        int w = stz.countTokens();
        String word;
        int c = 0;
        for(int i =0;i<w;i++){
            word = stz.nextToken();
            boolean a =true;
            for(int k =0,j=word.length()-1;k<j;k++,j--){
                if(word.charAt(k)!=word.charAt(j)){
                    a = false;
                    break;
                }
            }
            if(a){
                c++;
                System.out.print(word+" , ");
            }
        }
        System.out.println();
        System.out.println("Number of Pelindrome Words are: "+c);
        sc.close();
    }
}
