// SECOND LARGEST ARRAY ELEMENT

package Arrays;
import java.util.Scanner;
public class secondLargestElement {
    public static int findMax(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findsecondMax(int [] arr) {
        int max = findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==  max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int max2 = findMax(arr);

        return max2;
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
        System.out.println("MAX ARRAY ELEMENT IS = " + findsecondMax(arr));
    }
}
