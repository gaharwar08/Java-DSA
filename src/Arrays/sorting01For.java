//SORTING OF ARRAY CONSISTING ONLY OF 0s AND 1s USING TWO FOR LOOPS

package Arrays;
import java.util.Scanner;
public class sorting01For {

    public static void sort(int[] arr) {
       // int n = arr.length;
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        System.out.println("SORTED ARRAY");
        sort(arr);
        printArray(arr);
    }
}
