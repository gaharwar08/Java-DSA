// target sum of two value in array
package Arrays;

import java.util.Scanner;
public class targetSum {
    public static int doublesum (int [] arr , int target){

        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
            return ans;
        }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("ENTER SIZE");
            int size = sc.nextInt();
            int [] arr = new int[size];

            System.out.println("ENTER ARRAY ELEMENTS");
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("ENTER TARGET");
                int target = sc.nextInt();

                System.out.println("Target =" + doublesum (arr , target));
            }
    }