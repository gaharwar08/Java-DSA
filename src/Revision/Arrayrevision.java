package Revision;
import java.util.Scanner;
public class Arrayrevision {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static int[] prefixSum(int [] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
         int size = sc.nextInt();
         int [] arr = new int[size];

         for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
         }
        System.out.println("ORIGINAL ARRAY");
         printArray(arr);

        System.out.println("ANSWER ARRAY");
        int [] ans = prefixSum(arr);
        printArray(ans);

    }
}
