package recursion;
import java.util.Scanner;
public class reversePrinting {
    public static void print(int n){

        // base case
        if(n==1){
            System.out.println(1);
            return;
        }

        // self work
        System.out.println(n);

        // recursive work / smaller problem
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}