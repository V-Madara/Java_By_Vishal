import java.util.Scanner;
public class WordPile {
static char ch[];
int top;
static int capacity;

WordPile(int cap) {                 
ch = new char[cap];
top = -1;
}

void pushChar(char v) {
if(top==capacity-1) {
System.out.println("Array is full");
}
else {
ch[++top] = v;
}
}
char popChar() {
char c=' ';
if(top==-1) {
System.out.println("Array is empty");
}
else{
c = ch[top--];
}
return c;
}

public static void main(String ar[] ) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the numbers of elements: ");
capacity = sc.nextInt();
WordPile ob = new WordPile(capacity);
System.out.print("Enter the number of element you want to enter in the array: ");
ob.top = sc.nextInt()-1;
for(int i =0;i<=ob.top;i++) {
System.out.print("Enter the character: ");
ch[i] = sc.next().charAt(0);
}
while(true) {
System.out.println("Press 1: To add element");
System.out.println("Press 2: To pop element");
int a= sc.nextInt();
if(a==1) {
System.out.print("Enter the character: ");
char v = sc.next().charAt(0);
ob.pushChar(v); 
}
else if(a==2) {
System.out.println("Character Popped: "+ob.popChar());
}
else
break;
}
sc.close();
}
}



