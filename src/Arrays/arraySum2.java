package Arrays;

public class arraySum2 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        arr[0]=67;
        arr[1]=77;
        arr[2]=97;
        arr[3]=90;
        arr[4]=89;

        int sum = 0;
        for(int i=0; i<5; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
            System.out.println("sum=" + sum);


    }
}
