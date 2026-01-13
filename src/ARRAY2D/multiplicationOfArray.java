package ARRAY2D;
import java.util.Scanner;
public class multiplicationOfArray {
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void multi(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r2 != c1){
            System.out.println("MULTIPLICATION IS NOT POSSIBLE : WRONG DIMENSION");
            return;
        }
        int[][] multi = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printMatrix(multi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS AND COLUMNS OF MATRIX 1");
        System.out.println("ENTER r1");
        int r1 = sc.nextInt();
        System.out.println("ENTER c1");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("ENTER MATRICES");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER ROWS AND COLUMNS OF MATRIX 2");
        System.out.println("ENTER r2");
        int r2 = sc.nextInt();
        System.out.println("ENTER c2");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("ENTER METRICES");
        for(int i=0; i<r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        multi(a,r1,c1,b,r2,c2);
    }
}
