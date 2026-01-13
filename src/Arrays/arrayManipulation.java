// ARRAY MANIPULATION EX; 123 4 321;

package Arrays;

import java.util.Scanner;
public class arrayManipulation {
    public static int arrayManipulation(int [] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIZE OF ARRAY");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("ARRAY MANIPULATION = " + arrayManipulation(arr));
    }
}