import java.util.*;
public class ArraySum { 

public static int sum(int ar[]){
int sum = 0;
for(int x : ar){
sum+=x;
}
return sum;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Size of Array: ");
int s = sc.nextInt();
int ar[] = new int[s];
for(int i =0;i<s;i++){
System.out.print("Enter the Element: ");
ar[i] =sc.nextInt();
}
System.out.println("Array is --> "+Arrays.toString(ar));
System.out.println("Sum of the Array: "+sum(ar));
sc.close();
}
}