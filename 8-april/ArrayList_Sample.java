import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Integer> list=new ArrayList<>();
        System.out.println("Adding elements");
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(11);
        System.out.println(list);
        System.out.println("Deleting elements");
        list.remove(2);
        System.out.println(list);
        System.out.println("Accessing elements");
        System.out.println(list.get(2));
        System.out.println("Updating elements");
        list.set(2, 14);
        System.out.println(list);
        System.out.println("Traversing elements");
        for(int x:list){
            System.out.print(x+ " ");
        }
    }
}
