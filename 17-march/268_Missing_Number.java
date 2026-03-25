class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length,sum=0;
        int total=len*(len+1)/2;
        for(int num:nums){
            sum+=num;
        }
        return total-sum;
    }
}
