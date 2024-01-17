import java.util.Arrays;
import java.util.Scanner;

public class SortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.next().toLowerCase().trim();

        char ar[] = str.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((int) ar[i] > (int) ar[j]) {
                    char temp;
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                }
            }
        }
        str = Arrays.toString(ar);
        str.toUpperCase();
        System.out.println(str);
    }

}
