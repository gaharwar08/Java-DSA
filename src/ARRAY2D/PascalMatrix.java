package ARRAY2D;
import java.util.Scanner;
public class PascalMatrix {
    public static void printMatrix(int [][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] pascalMatrix(int n){
        int [][] ans = new int[n][];
        for(int i=0; i<n; i++){
            // ith row have i+1 element, down part is for creating column for that row
            ans[i] = new int [i+1];
            // first row and last column element are 1
            ans[i][0] = ans[i][i] = 1;

            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N");
        int n = sc.nextInt();
        int[][] ans = pascalMatrix(n);
        printMatrix(ans);

    }
}
