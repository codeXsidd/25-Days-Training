/*Given an array of integers, find all the leaders in the array.
  An element is called a leader if it is greater than all elements to its right.
  The last element is always a leader.
  i/p: 16, 17, 4, 3, 5, 2  o/p: 17, 5, 2
  Constraints:
  Time complexity:O(n)
  Space complexity:O(1)
  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr={16,17,3,4,5,2};
		int n=arr.length;
		int max=arr[n-1];
		int track=n-1;
		//int j=0;
		//int[] res=new int[n];
		//res[0]=max;
		//j++;
		for(int i=n-2;i>=0;i--){
		    if(arr[i]>max){
		        max=arr[i];
		        track--;
		        arr[track]=arr[i];
		    }
		}
		for(int i=n-1;i>=track;i--)
		System.out.print(arr[i]+"  ");

	}
}

//------------------------------------------------------------------------------------------------

//BruteFOrce 
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
