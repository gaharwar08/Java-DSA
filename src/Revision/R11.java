package Revision;
import java.util.Scanner;
public class R11 {
   // public static void printArray(int [] arr){
     //   for(int i=0; i<arr.length; i++){
      //      System.out.println(arr[i]);
    //    }
    //    System.out.println();

//}
    public static int[] reverseArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for(int i=n-1; i>=0; i--){
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
        int [] ans = reverseArray(arr);
       // printArray(arr);
        System.out.println(reverseArray(arr));

    }
}
