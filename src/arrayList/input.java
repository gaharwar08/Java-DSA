// LEARNING DIFFERENT METHODS IN ARRAYLIST

package arrayList;
import java.util.ArrayList;
public class input {
    public static void main(String[] args) {
        // wrapper class
       // Integer i = Integer.valueOf(4);
       // System.out.println(i);

       // Float f = Float.valueOf(4.5f);
       // System.out.println(f);

        // how to make ArrayList

        ArrayList <Integer> i1 = new ArrayList<>();
       // ArrayList <Boolean> b1 = new ArrayList<>();
       // ArrayList <Character> c1 = new ArrayList<>();
       // ArrayList <String> s1 = new ArrayList<>();
       // ArrayList <Float> f1 = new ArrayList<>();
       // ArrayList <Double> d1 = new ArrayList<>();

        // ADD NEW ELEMENT

        i1.add(1);
        i1.add(5);
        i1.add(7);
        i1.add(4);
        i1.add(3);

        // PRINTING THE ARRAY LIST DIRECTLY
        System.out.println(i1);

        // GET AN ELEMENT AT ith INDEX
        System.out.println("PRINTING ANY INDEX");
        System.out.println(i1.get(4));

        // PRINT WITH FOR LOOP

        System.out.println("PRINTING USING FOR LOOP");
        for(int i = 0; i<i1.size(); i++){
            System.out.println(i1.get(i));
        }
        // ADDING ELEMENT AT SOME INDEX I
        System.out.println("AFTER ADDING NEW ELEMENT IN ARRAYLIST");
        i1.add(1, 100); // [1 100 5 7 4 3]
        System.out.println(i1);

        // MODIFYING ELEMENT AT INDEX i
        System.out.println("AFTER MODIFYING NEW ARRAYLIST");
        i1.set(1, 10);
        System.out.println(i1); // [1 10 5 7 4 3]

        // REMOVING ELEMENT FORM ARRAYLIST
        System.out.println("AFTER DELETING ONE ELEMENT FROM ARRAYLIST");
        i1.remove(3);
        System.out.println(i1); // [1 10 5 4 3]

        // REMOVING AN ELEMENT E WITHOUT KNOWING ITS INDEX
        System.out.println("REMOVING ELEMENT WITHOUT KNOWING ITS INDEX");
        i1.remove(Integer.valueOf(5));// [1 10 4 3]
        System.out.println(i1);

        // CHECKING IF AN ELEMENT EXIST
        System.out.println("CHECKING IF ELEMENT IS PRESENT OR NOT");
        boolean ans = i1.contains(Integer.valueOf(40));
        System.out.println(ans);

        // IF WE DON'T SPECIFY ANYTHING IN ARRAYLIST THEN WE CAN PUT ANYTHING INSIDE THE CLASS i1
        ArrayList i = new ArrayList();
        i.add("pappu");
        i.add(2);
        i.add(7.4);
        i.add(true);
        i.add(false);
        System.out.println(i);
    }
}