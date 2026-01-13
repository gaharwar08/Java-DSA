package conditions;
import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("The number is negative"); // 0 is consider as negative
        }
    }
}
