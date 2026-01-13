//for greatest array using user input

package Arrays;

import java.util.Scanner;

public class greatestArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("The value of greatest array is:" + ans);
    }
}

