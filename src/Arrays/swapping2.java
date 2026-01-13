// SWAPPING OF TWO NUMBERS USING ADDITION AND SUBTRACTION

package Arrays;
import java.util.Scanner;
public class swapping2 {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" Value of a " + a);
        System.out.println(" Value of b " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE OF A");
        int a = sc.nextInt();
        System.out.println("ENTER VALUE OF B");
        int b = sc.nextInt();

        swap(a, b);
    }
}
