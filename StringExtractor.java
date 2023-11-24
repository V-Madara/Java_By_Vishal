import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StringExtractor {

    private static Boolean textExtractor(String path,String key) throws FileNotFoundException{
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.contains(key)){
                sc.close();
                return true;
            }
        }
        sc.close();
        return false;

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        System.out.print("Enter the String to be found: ");
        String key = sc.nextLine();
        
        if(textExtractor(path, key))
        System.out.println("String Found..!!");
        else
        System.out.println("String Not Found..!!");
        sc.close();
    }
}
