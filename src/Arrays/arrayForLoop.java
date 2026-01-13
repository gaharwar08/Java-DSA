// for each loop

package Arrays;

public class arrayForLoop {
    public static void main(String[] args) {
        int [] age =  new int[3];

        age[0] = 67;
        age[1] = 57;
        age[2] = 34;

        for(int x : age){
            System.out.println(x);
        }
     }
}
