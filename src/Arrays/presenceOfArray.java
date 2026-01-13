// Presence of array
package Arrays;


public class presenceOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 56;
        arr[1] = 34;
        arr[2] = 55;
        arr[3] = 78;
        arr[4] = 90;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 91) {
                System.out.println("The value of array is present");
            }
            else{
                    System.out.println("The value of array is not present");
                }


        }
    }
}

