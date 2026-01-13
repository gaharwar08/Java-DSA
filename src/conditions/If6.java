package conditions;
import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 5 == 0 && n % 11 == 0){
            System.out.println("The number is divisible");
        }
        else{
            System.out.println("The number is not divisible");
        }
    }
}
