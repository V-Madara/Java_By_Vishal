import java.util.Scanner;
public class FileNameExtractor {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter the file name: ");
    String str = sc.nextLine();
    int a = str.lastIndexOf("\\");
    int b = str.lastIndexOf(".");
    String out="",name="",ext="";
    for(int i =0;i<str.length();i++) {
    if(i>a&&i<b) {
    name = name+str.charAt(i);
    }else if(i>=b) {
    ext = ext+str.charAt(i);
    }else {
    out = out+str.charAt(i);
    }
}
System.out.println("Output: "+out);
System.out.println("Filename: "+name);
System.out.println("Extention: "+ext);
}
}
