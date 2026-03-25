class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        if(nums.length%2==0)
           return nums[n-1];
        return nums[n];
    }
}
