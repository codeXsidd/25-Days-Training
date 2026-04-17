//Array sorting

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;
}
return false;
    }
}


//Using ArrayList
// Time Limit Exceeded 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int n:nums){
            if(l.contains(n))return true;
            l.add(n);
}
return false;
    }
}


//Using HashSet
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        for(int n:nums){

          // if condition checks if element alreeady present in the set 
          //if it is already inside then true
          //if not then false
            if(!s.add(n))return true;
}
return false;
    }
}
