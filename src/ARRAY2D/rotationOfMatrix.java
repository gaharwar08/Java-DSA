// ROTATION OF A MATRIX BY 90 DEGREE

package ARRAY2D;
import java.util.Scanner;
public class rotationOfMatrix {
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

       // printMatrix(matrix);
    }
    public static void reverseArray(int [] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[][] matrix, int n){
        transposeInPlace(matrix, n, n);
            for(int i=0; i<n; i++){
                reverseArray(matrix[i]);
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE ROW AND COLUMN");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        printMatrix(matrix);

        rotate(matrix, r);
        System.out.println("ROTATED ARRAY");
        printMatrix(matrix);
    }
}