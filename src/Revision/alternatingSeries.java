package Revision;
import java.util.Scanner;

public class alternatingSeries {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum -= i;      // even → subtract
                } else {
                    sum += i;      // odd → add
                }
            }

            System.out.println("Sum of alternating series = " + sum);
        }
    }


