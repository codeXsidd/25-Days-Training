import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
	    Iterator<Integer> it = list.iterator();
	    while(it.hasNext()){
	        int num = it.next();
	        if(num == 11){
	            it.remove();
	        }
	        
	    }
	    System.out.print(list);
	}
}
OUTPUT:
[10, 11,12]
[10,12]
