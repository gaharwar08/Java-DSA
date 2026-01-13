// FINDING PREFIX SUM OF AN ARRAY BY CREATING A NEW ARRAY

package Arrays;
import java.util.Scanner;
public class prefixSum {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static int[] prefixSum(int [] arr){
        int n = arr.length;
        int [] pref = new int[n];
        pref [0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
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

        int[] pref = prefixSum(arr);
        System.out.println("ANSWER ARRAY");
        printArray(pref);
    }
}