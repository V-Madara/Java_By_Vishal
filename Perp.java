import java.util.Scanner;
public class Perp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Team: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(n<2||n>9){
            System.out.println("Inavalid Number of Teams!");
            System.exit(0);
        }else{
            String team[] = new String[n];
            int max=0;
            for(int i =0;i<n;i++){
                System.out.print("Enter Team "+(i+1)+": ");
                team[i]=sc.nextLine();
                if(team[i].length()>max){
                    max=team[i].length();
                }
            }
            for(int i=0;i<max;i++){
                for(int j = 0;j<n;j++){
                    if(team[j].length()<=i){
                        System.out.print("   :");
                    }else{
                        System.out.print(" "+team[j].charAt(i)+" :");
                    }
                }
                System.out.println();
            }
        }
        
    }
}