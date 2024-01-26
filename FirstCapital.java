import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        StringTokenizer stz = new StringTokenizer(str);
        String wrd = "", nwrd = "", nstr = "";
        while (stz.hasMoreTokens()) {
            wrd = stz.nextToken();
            for (int i = 0; i < wrd.length(); i++) {
                if (i == 0) {
                    nwrd = nwrd + Character.toUpperCase(wrd.charAt(i));
                } else {
                    nwrd = nwrd + wrd.charAt(i);
                }
            }
            nstr = nstr + " " + nwrd;
            nwrd = "";
        }
        System.out.println(nstr.trim());
    }
}
