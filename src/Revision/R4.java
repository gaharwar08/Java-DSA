package Revision;

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n > 0){
            System.out.println("Number is +ve");
        }
        else if(n < 0){
            System.out.println("Number is -ve");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
