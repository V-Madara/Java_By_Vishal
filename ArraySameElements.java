// import java.util.Arrays;
// import java.util.Scanner;

// public class ArraysSameElements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Size of Array 1 : ");
//         int s1 = sc.nextInt();
//         System.out.print("Size of Array 2 : ");
//         int s2 = sc.nextInt();
//         if(s1!=s2){
//             System.out.println("Arrays Are Not Equal..!!");
//             System.exit(0);
//         }
//         int ar1[] = new int[s1];
//         int ar2 [] = new int[s2];
//         System.out.println("Enter Element in Array 1");
//         for(int i =0;i<s1;i++){
//             System.out.print("Enter Element: ");
//             ar1[i]=sc.nextInt();
//         }
//         System.out.println("Enter Element in Array 2");
//         for(int i =0;i<s2;i++){
//             System.out.print("Enter Element: ");
//             ar2[i]=sc.nextInt();
//         }

//         System.out.println("Array 1 -->  "+Arrays.toString(ar1));
//         System.out.println("Array 2 -->  "+Arrays.toString(ar2));

//         for(int i =0;i<s1;i++){
//             if(ar1[i]!=ar2[i]){
//                 System.out.println("Array Do not contain same Element..!!");
//                 System.exit(0);
//             }
//         }
//         System.out.println("Array Contains Same Element..!!");
//     sc.close();
//     }
    
// }

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

	public static void main(String[] args) {
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));
	}

	static boolean sameElements(Object[] array1, Object[] array2) {
		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));
		
		// if size is different, means there will be a mismatch
		if (uniqueElements1.size() != uniqueElements2.size()) return false;
		
		for (Object obj : uniqueElements1) {
			// element not present in both?
			if (!uniqueElements2.contains(obj)) return false;
		}
		
		return true;
	}

}
