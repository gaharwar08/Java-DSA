// REVERSING ARRAYLIST USING SWAPPING METHOD

package arrayList;

import java.util.ArrayList;
public class reverse1 {
    public static void reverseList(ArrayList<Integer> List) {
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
        ArrayList<Integer> List = new ArrayList<>();
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
    }
}