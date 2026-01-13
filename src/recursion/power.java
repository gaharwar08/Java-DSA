package recursion;
import java.util.Scanner;
public class power {
    public static int power(int p, int q){

        // base problem
        if(q == 0){
            return 1;
        }

        // recursive problem
        return power(p,q-1) * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p,q));
    }
}