// target sum of three value in array
package Arrays;

import java.util.Scanner;
public class targetSum2 {
    public static int triplesum(int [] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    ans++;
                }
            }
        }
    }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER TARGET");
        for(int i=0; i<arr.length; i++){
            int target = sc.nextInt();

            System.out.println("VALUE = " + triplesum(arr, target));
        }
    }
    }

