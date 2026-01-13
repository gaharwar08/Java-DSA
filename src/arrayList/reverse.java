// REVERSING AN ARRAYLIST USING SWAP METHOD AND ALSO USING INBUILT FUNCTIONS

package arrayList;
import java.util.*;
public class reverse {
    public static void reverseList(ArrayList <Integer> List) {
        int i = 0;
        int j = List.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(List.get(i));
            List.set(i, List.get(j));
            List.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> List = new ArrayList<>();
        List.add(0);
        List.add(10);
        List.add(3);
        List.add(5);
        List.add(22);
        List.add(10);
        System.out.println("ORIGINAL ARRAYLIST");
        System.out.println(List);

        reverseList(List);
        System.out.println("REVERSED ARRAYLIST");
        System.out.println(List);

        // SORTING STRING ARRAYLIST USING IN BUILT FUNCTION OF ARRAYLIST

        ArrayList <String> L1 = new ArrayList<> ();
        L1.add("AJAY");
        L1.add("ATHARV");
        L1.add("SATYAM");
        L1.add("LUCKY");
        L1.add("DEV");

        System.out.println("ORIGINAL ARRAYLIST OF STRING");
        System.out.println(L1);

        Collections.sort(L1);
        System.out.println(L1);

        System.out.println("IN REVERSE ORDER");
        Collections.sort(L1, Collections.reverseOrder());
        System.out.println(L1);
    }
}
