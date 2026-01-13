package Revision;

import java.util.Scanner;
public class R9 {
    static int count(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int [] arr =new int[size];


        System.out.println("Enter elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        for(int i=0; i<arr.length; i++){
            int x = sc.nextInt();

            System.out.println("count = " + count(arr , x));
        }
    }
}
