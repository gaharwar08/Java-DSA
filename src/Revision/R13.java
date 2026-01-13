package Revision;
import java.util.Scanner;
public class R13{
    public static boolean sort(int [] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
                if(arr[i-1] > arr[i]){
                    check = false;
                }
            }
        return check;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("ENTER ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sort(arr));
    }
}
