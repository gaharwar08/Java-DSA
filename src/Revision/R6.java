package Revision;

import java.util.Scanner;
public class R6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("Total marks " + (a+b+c+d+e) );

        // for percentage
        double percentage;

        double per = ((a+b+c+d+e)/500.0)*100;
        System.out.println("Percentage = " + per + "%");







    }
}
