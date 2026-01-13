// checking whether array is sort or not
package Arrays;

import java.util.Scanner;
public class arraySortCheck {
    public static boolean sort(int [] arr){
        boolean check = true;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter array element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" ARRAY is sorted =" + sort(arr));
    }
}
