// making function user input

package Arrays;

import java.util.Scanner;
public class makingFunction {

    public static void print_my_name(String name){

        System.out.println(name);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        print_my_name(name);
    }


    }


