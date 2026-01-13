//2-D array

package Arrays;

public class arrayBuilding {
    public static void main(String[] args) {
        int build [][]  = new int[2][3];

        build[0][0] = 101;
        build[0][1] = 102;
        build[0][2] = 103;
        build[1][0] = 201;
        build[1][1] = 202;
        build[1][2] = 203;

        for(int i = 0; i<2; i++){
            for(int j =0; j<3; j++){
                System.out.print(build[i] [j]);
                System.out.print(" ");

            }
            System.out.println();
     }


    }
}
