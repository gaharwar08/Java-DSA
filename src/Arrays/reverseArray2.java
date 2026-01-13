// reverse array

package Arrays;

public class reverseArray2 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        arr[0]=98;
        arr[1]=87;
        arr[2]=78;
        arr[3]=79;
        arr[4]=65;

        for(int i=4; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
