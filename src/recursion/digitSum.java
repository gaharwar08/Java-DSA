package recursion;
import java.util.Scanner;
public class digitSum {
    public static int sum(int n){

        // base casse
        if(n>=0 && n<=9){
            return n;
        }

        // recursive work
        int smallAns = sum(n/10);

        // self work
        int ans = smallAns + n%10;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}