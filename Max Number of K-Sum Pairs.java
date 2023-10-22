class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int op=0;
        int sum;
        while(i<j){
            sum=(nums[i]+nums[j]);
            if(sum<k){
                i++;
            }else if(sum>k){
                j--;
            }else{
                i++;
                j--;
                op++;
            }
        }
        return op;
    }
}

