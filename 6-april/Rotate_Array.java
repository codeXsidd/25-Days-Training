import java.util.*;

class Main{

    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int k=5;
        k = k % n;
       int n = arr.length;
        reverse(arr,0,k);
        reverse(arr, k+1,n);
       reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
