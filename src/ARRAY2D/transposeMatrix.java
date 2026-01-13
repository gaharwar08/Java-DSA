// TRANSPOSE OF A MATRIX

package ARRAY2D;
import java.util.Scanner;
public class transposeMatrix {
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    /* making new matrix
    public static void transposeOfMatrix(int[][] matrix, int r, int c){
       int[][] ans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        printMatrix(ans);
        }

    */


    // changing in the same matrix
    public static void transposeInplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // swapping matrix[i][j] to matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
         printMatrix(matrix);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input of row and column
        System.out.println("ENTER ROW AND COLUMN OF MATRIX");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        // input of matrix element
        System.out.println("ENTER MATRIX ELEMENTS");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

       transposeInplace(matrix, r, c);
    }
}
