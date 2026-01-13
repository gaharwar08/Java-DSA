// FINDING PREFIX SUM OF AN ARRAY IN THE SAME ARRAY

package Arrays;
import java.util.Scanner;
public class prefixSum2 {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void prefixSum(int [] arr){
        int n= arr.length;
       // arr[0] = arr[0];
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        System.out.println("NEW ARRAY");
        prefixSum(arr);
        printArray(arr);
    }
}
