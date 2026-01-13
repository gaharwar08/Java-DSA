// SORT ARRAY BASIS ON EVEN AND ODD IF NUMBER IS EVEN IT SHOULD BE IN LEFT AND IF NUMBER IS ODD IT SHOULD BE IN RIGHT

package Arrays;
import java.util.Scanner;
public class evenOddSorting {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void evenArray(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
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

        evenArray(arr);
        System.out.println("NEW ARRAY");
        printArray(arr);
    }
}

