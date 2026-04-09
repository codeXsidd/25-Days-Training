import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();
        Map<Integer,String> lhm = new LinkedHashMap<>();
        Map<Integer,String> tm = new TreeMap<>();

        int[] arr = {50, 20, 30, 100, 10};

        // put()
        for(int a : arr){
            hm.put(a, "A");
            lhm.put(a, "A");
            tm.put(a, "A");
        }

        System.out.println("Initial Maps:");
        System.out.println("HM  : " + hm);
        System.out.println("LHM : " + lhm);
        System.out.println("TM  : " + tm);

        // get()
        System.out.println("\nget(20):");
        System.out.println("HM  : " + hm.get(20));
        System.out.println("LHM : " + lhm.get(20));
        System.out.println("TM  : " + tm.get(20));

        // containsKey()
        System.out.println("\ncontainsKey(30):");
        System.out.println("HM  : " + hm.containsKey(30));
        System.out.println("LHM : " + lhm.containsKey(30));
        System.out.println("TM  : " + tm.containsKey(30));

        // containsValue()
        System.out.println("\ncontainsValue('A'):");
        System.out.println("HM  : " + hm.containsValue("A"));
        System.out.println("LHM : " + lhm.containsValue("A"));
        System.out.println("TM  : " + tm.containsValue("A"));

        // remove()
        hm.remove(20);
        lhm.remove(20);
        tm.remove(20);

        System.out.println("\nAfter remove(20):");
        System.out.println("HM  : " + hm);
        System.out.println("LHM : " + lhm);
        System.out.println("TM  : " + tm);

        // size()
        System.out.println("\nSize:");
        System.out.println("HM  : " + hm.size());
        System.out.println("LHM : " + lhm.size());
        System.out.println("TM  : " + tm.size());

        // replace()
        hm.replace(50, "B");
        lhm.replace(50, "B");
        tm.replace(50, "B");

        System.out.println("\nAfter replace(50,'B'):");
        System.out.println("HM  : " + hm);
        System.out.println("LHM : " + lhm);
        System.out.println("TM  : " + tm);

        // keySet()
        System.out.println("\nKeys:");
        System.out.println("HM  : " + hm.keySet());
        System.out.println("LHM : " + lhm.keySet());
        System.out.println("TM  : " + tm.keySet());

        // values()
        System.out.println("\nValues:");
        System.out.println("HM  : " + hm.values());
        System.out.println("LHM : " + lhm.values());
        System.out.println("TM  : " + tm.values());

        // entrySet()
        System.out.println("\nEntries:");
        System.out.println("HM  : " + hm.entrySet());
        System.out.println("LHM : " + lhm.entrySet());
        System.out.println("TM  : " + tm.entrySet());

        // iteration
        System.out.println("\nIterating HM:");
        for(Map.Entry<Integer,String> e : hm.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nIterating LHM:");
        for(Map.Entry<Integer,String> e : lhm.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nIterating TM:");
        for(Map.Entry<Integer,String> e : tm.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // putIfAbsent()
        hm.putIfAbsent(30, "C");
        lhm.putIfAbsent(30, "C");
        tm.putIfAbsent(30, "C");

        hm.putIfAbsent(40, "D");
        lhm.putIfAbsent(40, "D");
        tm.putIfAbsent(40, "D");

        System.out.println("\nAfter putIfAbsent:");
        System.out.println("HM  : " + hm);
        System.out.println("LHM : " + lhm);
        System.out.println("TM  : " + tm);

        // clear()
        hm.clear();
        lhm.clear();
        tm.clear();

        System.out.println("\nAfter clear():");
        System.out.println("HM  : " + hm);
        System.out.println("LHM : " + lhm);
        System.out.println("TM  : " + tm);
    }
}

/*Initial Maps:
HM  : {50=A, 20=A, 100=A, 10=A, 30=A}
LHM : {50=A, 20=A, 30=A, 100=A, 10=A}
TM  : {10=A, 20=A, 30=A, 50=A, 100=A}

get(20):
HM  : A
LHM : A
TM  : A

containsKey(30):
HM  : true
LHM : true
TM  : true

containsValue('A'):
HM  : true
LHM : true
TM  : true

After remove(20):
HM  : {50=A, 100=A, 10=A, 30=A}
LHM : {50=A, 30=A, 100=A, 10=A}
TM  : {10=A, 30=A, 50=A, 100=A}

Size:
HM  : 4
LHM : 4
TM  : 4

After replace(50,'B'):
HM  : {50=B, 100=A, 10=A, 30=A}
LHM : {50=B, 30=A, 100=A, 10=A}
TM  : {10=A, 30=A, 50=B, 100=A}

Keys:
HM  : [50, 100, 10, 30]
LHM : [50, 30, 100, 10]
TM  : [10, 30, 50, 100]

Values:
HM  : [B, A, A, A]
LHM : [B, A, A, A]
TM  : [A, A, B, A]

Entries:
HM  : [50=B, 100=A, 10=A, 30=A]
LHM : [50=B, 30=A, 100=A, 10=A]
TM  : [10=A, 30=A, 50=B, 100=A]

Iterating HM:
50 -> B
100 -> A
10 -> A
30 -> A

Iterating LHM:
50 -> B
30 -> A
100 -> A
10 -> A

Iterating TM:
10 -> A
30 -> A
50 -> B
100 -> A

After putIfAbsent:
HM  : {50=B, 100=A, 40=D, 10=A, 30=A}
LHM : {50=B, 30=A, 100=A, 10=A, 40=D}
TM  : {10=A, 30=A, 40=D, 50=B, 100=A}

After clear():
HM  : {}
LHM : {}
TM  : {}
*/
