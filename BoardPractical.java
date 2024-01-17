import java.util.*;

class Matrix {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ar[][];
    System.out.print("M = ");
    int M = sc.nextInt();
    System.out.print("N = ");
    int N = sc.nextInt();

    if(M>=20||M<=2||N>=20||N<=2){
        System.out.println("SIZE IS OUT OF RANGE");
        System.exit(0);
    }

    ar = new int [M][N];

    System.out.println("Enter the Elements in the Matrix -->");
    for(int i = 0;i<M;i++){
        for(int j =0;j<N;j++){
            ar[i][j] = sc.nextInt();
        }
    }

    System.out.println("ORIGINAL MATRIX")
    for(int i = 0;i<M;i++){
        for(int j =0;j<N;j++){
            System.out.print(ar[i][j]+"  ");
        }
        System.out.println();
    }

    int trans[][] =  new int[N][M];
    for(int i = 0;i<N;i++){
        for(int j = 0;j<M;j++){
            trans[i][j] = ar[j][i];
        }
    }

    System.out.println("TRANSPOSE MATRIX");
    for(int i = 0;i<N;i++){
        for(int j = 0;j<M;j++){
            System.out.print(trans[i][j]+"  ");
        }
        System.out.println();
    }

    int sum = 0;
    for(int i = 0;i<N;i++){
        for(int j = 0;j<M;j++){
            if(i == 0||i==N-1||j==0||j==M-1){
                sum+=trans[i][j];
            }
        }
    }
    System.out.println("SUM OF BOUNDARY ELEMENTS = "+sum);

    
}
}
