// odd number

package loops;
import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
            else{
                System.out.println();
            }
        }
    }
}
