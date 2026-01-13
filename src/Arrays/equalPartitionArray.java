// EQUAL PARTITION SUM OF ANY ARRAY

package Arrays;
import java.util.Scanner;
public class equalPartitionArray {
    public static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }
    public static boolean equalSumPartition(int [] arr){
        int totalSum = findArraySum(arr);

        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
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
        System.out.println("EQUAL SUM = " + equalSumPartition(arr));
    }
}
