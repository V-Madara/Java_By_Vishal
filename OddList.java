import java.util.*;

public class OddList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter Number of ELement you want to enter: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print("Enter Element: ");
            list.add(sc.nextInt());
        }
        // for(int i :list){
        //     if(i%2==0){
        //         System.out.println("List in not only odd");
        //         System.exit(0);
        //     }
        // }
        // System.out.println("List is only odd");
        if(onlyOddNumbers(list)){
            System.out.println("It Contains even Number also");
        }else{
            System.out.println("Only odd");
        }
        sc.close();
    }
    //For small List
    // public static boolean onlyOddNumbers(List<Integer>list){
    //     for(int i : list){
    //         if(i%2==0)
    //         return false;
    //     }
    //     return true;
    // }
    //For large list
    public static boolean onlyOddNumbers(List<Integer> list){
        return list.parallelStream().anyMatch(x-> x %2==0);
    }
}