import java.util.*;

public class Captital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        StringTokenizer stz = new StringTokenizer(str);
        String wrd = "", nstr = "", nwrd = "";
        while (stz.nextToken()) {
            wrd = stz.nextToken();
            for (int i = 0; i < wrd.length(); i++) {
                if (i % 2 != 0) {
                    nwrd = nwrd + Character.toUpperCase(wrd.charAt(i));
                    continue;
                }
                nwrd = nwrd + wrd.charAt(i);
            }
            nstr = nstr + " " + nwrd;
        }
        System.out.println(nstr.trim());
    }
}