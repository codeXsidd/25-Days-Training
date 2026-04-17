//map used time complexity O(n) 
//space complexity O(n)
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int n=nums.length/2;
      //iterate through array
      //"m.getOrDefault(i,0)+1" this thing helps us to get the current count of the element
      //if this count goes beyond nums.length/2
      //then that element is the majority element
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>n)return i;
}
return 0;
    }
}


//Time Complexity O(n)
//Space Complexity O(1)
// Boyer–Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int c=0,v=0;
        for(int n:nums){
            if(v==0)c=n;
            if(n==c)v++;
            else v--;
}
             return c;
    }



//return mid

//Time Complexity O(nlog n)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
