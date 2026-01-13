// SORTING OF ARRAY HAVING ONLY 0S AND 1S AS INPUT USING TWO POINTERS

package Arrays;
import java.util.Scanner;
public class sorting01 {
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void swap(int [] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void sort(int [] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
                if (arr[left] == 0) {
                    left++;
                }
                if (arr[right] == 1) {
                    right--;
                }
            }
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
        sort(arr);
        System.out.println("SORTED ARRAY");
        printArray(arr);
    }
}
