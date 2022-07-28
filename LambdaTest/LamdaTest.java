package LambdaTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class LamdaTest {
    



    public static void main(String[] args) {
        Comparator c = (Object o1, Object o2) -> {
            int zahl1 = (int) o1;
            int zahl2 = (int) o2;

            return zahl1-zahl2;

        };
        TreeSet<Integer> ts = new TreeSet<>(c);

        ts.add(2);
        ts.add(5);
        ts.add(400);
        ts.add(30);

        Iterator i = ts.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
