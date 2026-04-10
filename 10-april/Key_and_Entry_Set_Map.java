import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        //entry set 
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        // key set - only  to get the values by using key
        for (Integer a : map.keySet()) {
            System.out.println(map.get(a));
        }
        //key set-only to print key
        for (Integer a : map.keySet()) {
            System.out.println(a);
        }
    }
}
Output:
1 A
2 B
3 C
A
B
C
1
2
3
