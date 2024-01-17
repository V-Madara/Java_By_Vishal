import java.util.*;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        char ar[] = str.toCharArray();
        String nt = "";
        int c = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            for(char x : ar) {
                if(x == ar[i] && !nt.matches(""+x)){
                    c++;
                }
            }
            hm.put(ar[i], c);
            c=0;
        }
        System.out.println(hm);
        sc.close();
    }
}
