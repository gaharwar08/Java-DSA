package recursion;
import java.util.Scanner;
public class sum2 {
    public static int sum(int n){
        if(n==0) {
            return 0;
        }
        int smallAns = sum(n-1);
        int ans = smallAns + n;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
