// USER INPUT IN 2D ARRAY ------>

package ARRAY2D;
import java.util.Scanner;
public class UserInput {
    public static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int r = sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];

       System.out.println("ENTER ARRAY " + r*c + " ELEMENTS ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("2D ARRAY IS");
        printArray(arr);
    }
}
