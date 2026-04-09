/* Given a collection of intervals represented as an ArrayList<int[]>, merge all overlapping intervals.
An overlap occurs when an interval's start time is less than or equal to the previous interval's end time (start,end). 
The input list is guaranteed to be sorted by start times.
The algorithm must run in O(n) time complexity using a single-pass approach.
Input Format
An ArrayList of integer arrays, where each int[] has a size of 2: [start, end].
Input is provided in sorted order based on the start value.
Output Format
An ArrayList containing the merged intervals.Test Cases
Example 1=Input: [[1, 3], [2, 6], [8, 10], [15, 18]]Output: [[1, 6], [8, 10], [15, 18]]
Explanation: [1, 3] and [2, 6] overlap because 2<3. They merge into [1, 6].
Example 2=Input: [[1, 3], [2, 6], [4, 10], [8, 10], [15, 18]]Output: [[1, 10], [15, 18]]
Explanation: The first four intervals all overlap or touch, merging into one large interval from 1 to 10.
Example 3 (Touching Boundaries)Input: [[1, 2], [2, 5]]Output: [[1, 5]]
Explanation: The end of the first interval (2) is equal to the start of the second (2).
They are considered overlapping and merged.
*/
import java.util.*;
public class Main {
    public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<int[]> arr=new ArrayList<>();
      int n=sc.nextInt();
      for(int i=0;i<n;i++) {
            int start=sc.nextInt();
            int end=sc.nextInt();
            int[] interval={start,end};
            arr.add(interval);
        }
        ArrayList<int[]> res=new ArrayList<>();
        for(int[] i:arr) {
            if(res.isEmpty()||i[0]>res.get(res.size()-1)[1]) {
                res.add(i);
            } else {
                int[] last=res.get(res.size()-1);
                last[1]=Math.max(last[1],i[1]);
            }
        }
      for(int[] i:res)System.out.print(Arrays.toString(i)+" ");
    }
}
  /* Enter number of intervals: 4
1 3
2 6
8 10
15 18
Output: [1, 6] [8, 10] [15, 18] */
