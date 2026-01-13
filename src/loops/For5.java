//counting digits

package loops;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofdigit = 0;


       for (int i = 1; i <= n; i++) {

            n = n / 10;
            numofdigit++;
        }
                System.out.println(numofdigit);

        }
    }

