//using hashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ds used to reduce time complexity form O(n^2)
        
        Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    int c=target-nums[i];
    if(map.containsKey(c)){
        return new int[]{i,map.get(c)};
    }
    map.put(nums[i],i);
}
return new int[]{-1,-1};
   
    }
}
