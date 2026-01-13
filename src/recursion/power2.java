package recursion;
import java.util.Scanner;
public class power2 {
    public static int power(int p, int q){

        // base case
        if(q == 0){
            return 1;
        }

        // recursive problem
        if(q % 2 == 0){
            int ans = power(p, q/2) * power(p, q/2);
            return ans;
        }
        else{
            return p * power(p, q/2) * power(p, q/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p,q));
    }
}