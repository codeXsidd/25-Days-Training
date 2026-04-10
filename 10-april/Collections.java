import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(11);
        Collections.sort(list);
        System.out.println(list);
        int ind = Collections.binarySearch(list, 13);
        System.out.println(ind);
        Collections.reverse(list);
        System.out.println(list);
        int M = Collections.max(list);
        System.out.println(M);
        int m = Collections.min(list);
        System.out.println(m);
        int cnt = Collections.frequency(list, 11);
        System.out.println(cnt);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
OUTPUT:
[11, 11, 12, 13]
3
[13, 12, 11, 11]
13
11
2
[13, 12, 11, 11]
