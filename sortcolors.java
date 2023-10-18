class Solution {
    public void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int n:nums){
            if(n==0){
                zeroCount++;
            }else if(n==1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            nums[i]=0;
        }
        for(int i=zeroCount;i<zeroCount+oneCount;i++){
            nums[i]=1;
        }
        for(int i=zeroCount+oneCount;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
