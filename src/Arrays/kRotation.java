// K ROTATION OF AN ARRAY

package Arrays;
import java.util.Scanner;
public class kRotation {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static int[] arrayRotation(int [] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n ; i++) {
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - k ; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
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

        System.out.println("ENTER K ");
        for(int i=0; i<arr.length; i++) {
            int k = sc.nextInt();

            int [] ans = arrayRotation(arr,k);
            printArray(ans);
        }
    }
}
