package Arrays;

public class arraySum {
    public static void main(String[] args) {
        float [] arr = new float[5];

        arr[0] = 34.5f;
        arr[1] = 45.7f;
        arr[2] = 36.5f;
        arr[3] = 89.5f;
        arr[4] = 23.9f;

         float sum = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);


    }
}
