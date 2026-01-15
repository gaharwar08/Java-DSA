package Revision;
import java.util.Scanner;

public class R79 {
        static void reverseOfarray(int arr[]){
            int start = 0;
            int end = arr.length-1;

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = arr[temp];

                start++;
                end--;


            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size array");
            int size = sc.nextInt();
            int arr[]=new int[size];

            System.out.println("Enter elements");
            for(int i=0;i< arr.length;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Reversed array");
            reverseOfarray(arr);

            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

