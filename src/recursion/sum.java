package recursion;
import java.util.Scanner;
public class sum {
    public static int sum (int n){
        int ans = n*(n+1)/2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
