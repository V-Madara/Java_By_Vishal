import java.util.Scanner;

public class Book {

    String name[];
    int point,max;

    Book(int cap) {
        max = cap;
        name = new String[max];
        point=-1;
    }
    void add(String v) {
        if(point==max-1) {
            System.out.println("Self is Full");
        }else {
            name[++point] = v;
        }
    }
    void tell() {
        if(point==-1) {
            System.out.println("Self is empty");
        }else {
            System.out.println("Last book: "+name[point]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of self: ");
        int c = sc.nextInt();
        Book ob = new Book(c);
        System.out.print("Enter the number of book you want to store: ");
        ob.point = sc.nextInt()-1;
        sc.nextLine();
        for(int i =0;i<=ob.point;i++) {
            System.out.print("Enter the book name: ");
            ob.name[i] =sc.nextLine();
        }
        while(true) {
            System.out.println("Press 1: To add Book");
            System.out.println("Press 2: To show name of last Book");
            System.out.println("Press 3: To end");
            int a = sc.nextInt();
            sc.nextLine();
            if(a==1) {
                System.out.print("Enter the book name: ");
                ob.add(sc.nextLine());
            }else if(a==2) {
                ob.tell();
            }else {
                break;
            }
        }
        sc.close();
    }
}
