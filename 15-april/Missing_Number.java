//using in 2 array

public class Main {
    public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        long sa=0,sb=0,sc2=0,ssa=0,ssc=0;
        for(int x:a)
          sa+=x;
        for(int x:b)
          sb+=x;
        for(int x:c) 
        {
          sc2+=x; 
          ssc+=(long)x*x;
        }
        for(int x:a) 
          ssa+=(long)x*x;

        System.out.println("Missing in B: "+(sa-sb));

        long s=sa-sc2;
        long p=(s*s-(ssa-ssc))/2;
        long d=(long)Math.round(Math.sqrt(s*s-4*p));

        System.out.println("Missing in C: "+(s+d)/2+" and "+(s-d)/2);
    }
}


///using Array and ArrayList
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        for(int i=0;i<b.length;i++){
            if(a[i]!=b[i]){
              System.out.println("Missing in B: "+a[i]); 
              break;
            }
        }
        if(a[b.length]!=b[b.length-1]) System.out.println("Missing in B: "+a[b.length]);

        List<Integer> mc=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(a[i]!=c[i]) mc.add(a[i]);
        }
        while(mc.size()<2) mc.add(a[n-mc.size()-1]);
        System.out.println("Missing in C: "+mc.get(0)+" and "+mc.get(1));
    }
}

// using xor
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        int xorB=0;
        for(int x:a) xorB^=x;
        for(int x:b) xorB^=x;
        System.out.println("Missing in B: "+xorB);

        int xorC=0;
        for(int x:a) xorC^=x;
        for(int x:c) xorC^=x;
        System.out.println("Missing in C: "+xorC);
    }
}

//using ArrayList 
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();

        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        for(int i=0;i<n-1;i++)
        b.add(sc.nextInt());
        for(int i=0;i<n-2;i++)
        c.add(sc.nextInt());

        for(int x:a){
            if(!b.contains(x)) System.out.println("Missing in B: "+x);
        }

        List<Integer> mc=new ArrayList<>();
        for(int x:a){
            if(!c.contains(x)) mc.add(x);
        }
        System.out.println("Missing in C: "+mc.get(0)+" and "+mc.get(1));
    }
}
