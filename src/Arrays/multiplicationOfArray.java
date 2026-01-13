// multiplication of array

package Arrays;

public class multiplicationOfArray {
    public static void main(String[] args) {
        int [] arr = new int [5];

        arr[0]=79;
        arr[1]=90;
        arr[2]=56;
        arr[3]=46;
        arr[4]=60;

        int multi = 1;
        for(int i=0; i<5; i++){
            multi = multi*arr[i];
        }
        System.out.println("multiplication =" + multi);


    }
}
