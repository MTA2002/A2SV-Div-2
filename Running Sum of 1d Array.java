class Solution {
    public int[] runningSum(int[] nums) {
        int [] prefixSums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixSums[i]=sum;
        }
        return prefixSums;
    }
}
