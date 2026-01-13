// SORTING OF ARRAY IN NON-DECREASING ORDER (INPUT IS ALSO IN NON-DECREASING

package Arrays;
import java.util.Scanner;
public class arraySortingNonDecreasing {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void reverseArray(int [] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortSquares(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        int [] ans = new int[n];
        int k = 0;
       while(left <= right){
           if(Math.abs(arr[left]) > Math.abs(arr[right])){
               ans[k] = arr[left] * arr[left];
               k++;
               left++;
           }
           else{
               ans[k] = arr[right] * arr[right];
               k++;
               right--;
           }

       }
       return ans;
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

        int[] ans = sortSquares(arr);
        System.out.println("SORTED ARRAY WITH REVERSE");
        reverseArray(ans);
    }
}