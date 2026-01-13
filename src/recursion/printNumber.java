package recursion;
import java.util.Scanner;
public class printNumber {
    public  static void print(int n) {

        // base case
        if (n == 1) {              // halting condition or base case
            System.out.print(1);
            return;
        }

        // recursive problem
        print(n - 1);   // smaller or sub-problem
        System.out.print(" ");
            System.out.print(n);  // self working+
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
