package recursion;
import java.util.Scanner;
public class multiple {
    public static void multipleOfK(int num, int k){

        // base case
        if(k == 1){
            System.out.println(num);
            return;
        }

        // recursive problem
         multipleOfK(num, k-1);
        System.out.println(num*k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num = ");
        int num = sc.nextInt();
        System.out.println("k = ");
        int k = sc.nextInt();
        multipleOfK(num,k);
    }
}