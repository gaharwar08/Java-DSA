// TAKING INPUT AND PRINTING 2D ARRAY

package ARRAY2D;

public class Input2D {
    public static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        arr[0][0] = 4;
        arr[0][1] = 4;
        arr[0][2] = 4;
        arr[1][0] = 4;
        arr[1][1] = 4;
        arr[1][2] = 4;

        printArray(arr);
    }
}
