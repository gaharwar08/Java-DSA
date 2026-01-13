// greatest value in an array

package Arrays;

import java.util.Scanner;
public class greatestValue {

    static int greater(int[] arr, int x) {
        int greater = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x) {
                greater++;
            }
        }
        return greater;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIZE");
        int size = sc.nextInt();

        System.out.println("ENTER ARRAY ELEMENTS");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTER X");
        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();

            System.out.println("LAST INDEX =" + greater(arr ,  x));
        }
    }
}







