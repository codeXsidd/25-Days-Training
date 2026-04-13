import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
	    ListIterator<Integer> it = list.listIterator();
	    while(it.hasNext()){
	        int num = it.next();
	        System.out.println(num);
	        
	    }
	    while(it.hasPrevious()){
	        int num = it.previous();
	        System.out.println(num);
	    }
	    
	}
}
Output
[10, 11, 12]
10
11
12
12
11
10
