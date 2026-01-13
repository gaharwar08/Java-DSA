package recursion;
import java.util.Scanner;
public class digitCount {
    public static int countOfDigit(int n){

        // base case
       // if(n>=0 && n<= 9){
        if(n == 0){
            return 0;
        }

        // recursive problem
       int ans = 1 + countOfDigit(n/10);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countOfDigit(n));
    }
}