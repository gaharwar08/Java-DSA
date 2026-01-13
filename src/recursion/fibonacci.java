package recursion;
import java.util.Scanner;
public class fibonacci {
    public static int fibonacci(int n){

        // base case
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }

        // recursive problem
        int num = fibonacci(n-1) + fibonacci(n-2);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( fibonacci(n));
    }
}