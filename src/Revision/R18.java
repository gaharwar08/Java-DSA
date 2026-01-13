package Revision;
import java.util.Scanner;
public class R18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while(sc.hasNextInt()){
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
    }
}
