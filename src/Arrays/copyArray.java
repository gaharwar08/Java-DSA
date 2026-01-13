// copying of array
package Arrays;

//import java.util.Scanner;
public class copyArray {

    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String [] args ) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int[] arr = new int[5];

        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 8;
        arr[4] = 5;


        printArray(arr);


        int [] arr_2 = arr;
        printArray(arr_2);

        arr[0] = 0;
        arr[1] = 0;

        printArray(arr);

        printArray(arr_2);
    }
}