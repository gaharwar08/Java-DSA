package ARRAY2D;
import java.util.Scanner;
public class demo {
    public class sumOfMatrix {
        // FOR PRINTING
        public static void printMatrix(int[][] matrix){
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        // MAIN OPERATION
        public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
            if(r1 != r2 || c1 != c2){ // JAB C1 AUR C2 BARABAR NA HO TAB RETURN HOGA
                System.out.println("SUM OF MATRIX IS NOT POSSIBLE");
                return;
            }
            int[][] sum = new int[r1][c1];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            printMatrix(sum);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // INPUT FOR MATRIX 1
            System.out.println("ENTER NUMBER ROF ROWS AND COLUMNS OF MATRIX 1");
            System.out.println("ENTER r1");
            int r1 = sc.nextInt();
            System.out.println("ENTER c1");
            int c1 = sc.nextInt();
            int[][] a = new int[r1][c1];

            System.out.println("ENTER VALUES OF MATRIX 1");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            // INPUT FOR MATRIX 2
            System.out.println("ENTER NUMBER ROW AND COLUMNS OF MATRIX 2");
            System.out.println("ENTER r2");
            int r2 = sc.nextInt();
            System.out.println("ENTER c2");
            int c2 = sc.nextInt();
            int [][] b =new int[r2][c2];

            System.out.println("ENTER VALUES OF MATRIX 2");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    b[i][j] = sc.nextInt();
                }
            }
            // CALL CLASS
            add(a,r1,c1,b,r2,c2);
        }
    }
}
