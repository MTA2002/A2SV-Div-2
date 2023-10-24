class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double average=0;
        double maxaverage=-10000;
        
        while(i<nums.length){
           average+=nums[i];
           if(i>=k-1){
               maxaverage=Math.max(average/k,maxaverage);
               average-=nums[i-(k-1)];
           }
           i++;
        }
        return maxaverage;
    }
}
