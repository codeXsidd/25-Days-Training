/*Given an array of integers, find all the leaders in the array.
  An element is called a leader if it is greater than all elements to its right.
  The last element is always a leader.
  i/p: 16, 17, 4, 3, 5, 2  o/p: 17, 5, 2
  Constraints:
  Time complexity:O(n)
  Space complexity:O(1)
  */
 
import java.util.*;
public class Main {
    public static int[] leader(int[] arr) {
        int n = arr.length;
        int ind = n - 1;
        int maxlen = arr[ind];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxlen) {
                maxlen = arr[i];
                ind--;
                arr[ind] = arr[i];
            }

        }
        int[] res = new int[n - ind];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[ind++];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nums = leader(arr);
        System.out.print(Arrays.toString(nums));
    }
}


// OUTPUT:
// 6
// 16 17 4 3 5 2
// [17, 5, 2]

//------------------------------------------------------------------------------------------------
//USING RESULT ARRAY
public class Main 
{
    public static void main(String[] args) 
{
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int max=arr[n-1];
        int[] res=new int[n];
        int ptr=0;
        res[ptr++]=max;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                res[ptr++]=max;
            }
        }
        for(int i=ptr-1;i>=0;i--)System.out.print(res[i]+" ");
    }
}


//------------------------------------------------------------------------------------------------
//USING RECURSION 

public class Main 
{
    static int max;
    static void findleaders(int[] arr,int i,int n){
        if(i==n-1){
max=arr[i];
System.out.print(arr[i]+" ");
return;
}
        findleaders(arr,i+1,n);
        if(arr[i]>max){
max=arr[i];
System.out.print(arr[i]+" ");
}}
    public static void main(String[] args) 
{
        int[] arr={16,17,4,3,5,2};
        findleaders(arr,0,arr.length);

}}

//------------------------------------------------------------------------------------------------
//USING Shifting my leader to the end 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-count;i++){
            boolean isLeader=true;
            for(int j=i+1;j<n-count;j++){
                if(arr[i]<=arr[j]){isLeader=false;break;}
            }
            if(isLeader){
                int temp=arr[i];
                for(int k=i;k<n-count-1;k++) arr[k]=arr[k+1];
                arr[n-count-1]=temp;
                count++;
                i--;
            }
        }
        
        for(int i=n-count;i<n;i++)System.out.print(arr[i]+" ");
    }
}
