import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();

        int[] arr = {50, 20, 30, 100, 10};

        // add()
        for(int a : arr){
            hs.add(a);
            lhs.add(a);
            ts.add(a);
        }

        System.out.println("Initial Sets:");
        System.out.println("HS  : " + hs);
        System.out.println("LHS : " + lhs);
        System.out.println("TS  : " + ts);

        // contains()
        System.out.println("\ncontains(20):");
        System.out.println("HS  : " + hs.contains(20));
        System.out.println("LHS : " + lhs.contains(20));
        System.out.println("TS  : " + ts.contains(20));

        // remove()
        hs.remove(20);
        lhs.remove(20);
        ts.remove(20);

        System.out.println("\nAfter remove(20):");
        System.out.println("HS  : " + hs);
        System.out.println("LHS : " + lhs);
        System.out.println("TS  : " + ts);

        // size()
        System.out.println("\nSize:");
        System.out.println("HS  : " + hs.size());
        System.out.println("LHS : " + lhs.size());
        System.out.println("TS  : " + ts.size());

        // isEmpty()
        System.out.println("\nisEmpty:");
        System.out.println("HS  : " + hs.isEmpty());
        System.out.println("LHS : " + lhs.isEmpty());
        System.out.println("TS  : " + ts.isEmpty());

        // iteration
        System.out.println("\nIterating HS:");
        for(int e : hs){
            System.out.println(e);
        }

        System.out.println("\nIterating LHS:");
        for(int e : lhs){
            System.out.println(e);
        }

        System.out.println("\nIterating TS:");
        for(int e : ts){
            System.out.println(e);
        }

        // add (duplicate test)
        hs.add(30);
        lhs.add(30);
        ts.add(30);

        System.out.println("\nAfter adding duplicate 30:");
        System.out.println("HS  : " + hs);
        System.out.println("LHS : " + lhs);
        System.out.println("TS  : " + ts);

        // clear()
        hs.clear();
        lhs.clear();
        ts.clear();

        System.out.println("\nAfter clear():");
        System.out.println("HS  : " + hs);
        System.out.println("LHS : " + lhs);
        System.out.println("TS  : " + ts);
    }
}
/*Initial Sets:
HS  : [50, 20, 100, 10, 30]
LHS : [50, 20, 30, 100, 10]
TS  : [10, 20, 30, 50, 100]

contains(20):
HS  : true
LHS : true
TS  : true

After remove(20):
HS  : [50, 100, 10, 30]
LHS : [50, 30, 100, 10]
TS  : [10, 30, 50, 100]

Size:
HS  : 4
LHS : 4
TS  : 4

isEmpty:
HS  : false
LHS : false
TS  : false

Iterating HS:
50
100
10
30

Iterating LHS:
50
30
100
10

Iterating TS:
10
30
50
100

After adding duplicate 30:
HS  : [50, 100, 10, 30]
LHS : [50, 30, 100, 10]
TS  : [10, 30, 50, 100]

After clear():
HS  : []
LHS : []
TS  : []
*/
