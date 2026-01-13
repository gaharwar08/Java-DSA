package Revision;

import java.util.Scanner;
public class R3 {
    public static int add(int [] arr, int target){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ARRAY SIZE");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER TARGET");
        int target = sc.nextInt();

        System.out.println("Ans = " + add(arr, target));
    }
}
