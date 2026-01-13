// FIRST REPEATED ARRAY ELEMENT

package Arrays;
import java.util.Scanner;
public class firstRepeatedElement {
    public static int repeatedArray(int [] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return arr[i];
                }
            }

        }
        System.out.println("Not Found");
        return -1;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
    }
        System.out.println(" FIRST REPEATED ARRAY ELEMENT IS " + repeatedArray(arr));
       // repeatedArray(arr);
    }
}
