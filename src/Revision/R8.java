package Revision;

public class R8 {
    public static void printArray(int [] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        printArray(arr);

        arr[3] = 5;
        arr[0] = 9;

        printArray(arr);
    }



    }

