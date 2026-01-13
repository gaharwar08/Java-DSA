// last occurrence of value on array (LAST INDEX OF ARRAY ELEMENT)------>

package Arrays;

import java.util.Scanner;
public class lastIndex {
    static int lastOccurrence(int[] arr, int x){
        int lastindex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastindex = i ;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIZE");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTER X");
        for(int i=0; i<arr.length; i++){
            int x = sc.nextInt();

            System.out.println("LAST INDEX= " + lastOccurrence(arr , x));
        }
    }
}
