// swapping of two number when there is two input A & B using temporary variable

package Arrays;
import java.util.Scanner;
public class swapping {
    public static void swap1(int a, int b) {
        int t;

        t = a;
        a = b;
        b = t;
        System.out.println("AFTER SWAPPING VALUE OF A " + a);
        System.out.println("AFTER SWAPPING VALUE OF B " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF A");
        int a = sc.nextInt();
        System.out.println("ENTER VALUE OF B");
        int b = sc.nextInt();

       swap1(a,b);
    }

    }

