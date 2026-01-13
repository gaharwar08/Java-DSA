package timeAndSpace;
import java.util.Scanner;
public class practice{

    public static int sum(int n){
        int ans = n*(n+1)/2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER n");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
