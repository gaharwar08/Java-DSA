package recursion;
import java.util.Scanner;
public class factorial {
    public static int factorial(int n){

        // base case
        if (n == 0) {
            return 1 ;
        }

        // recursive problem
        int smallAns = factorial(n-1);
        int ans = n * smallAns;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}