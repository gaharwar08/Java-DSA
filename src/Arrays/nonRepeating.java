// ARRAY ELEMENTS WHICH IS NOT REPEATING

package Arrays;
import java.util.Scanner;
public class nonRepeating {
    public static int repeatArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    ans = arr[i];
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int size = sc.nextInt();
        int [] arr = new int [size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("REPEATED ARRAY = " + repeatArray(arr));

    }
}