import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character to be removed: ");
        char ch = sc.next().charAt(0);
        str = str.replace(""+ch, "");
        System.out.println("String After Replacement: "+str);
        // char ar[] = str.toCharArray();
        // String nstr="";
        // for(char x : ar){
        //     if(x!=Character.toLowerCase(ch)){
        //         nstr +=x;
        //     }
        // } 
        // System.out.println("New String: "+nstr);
        sc.close();
    }
}
