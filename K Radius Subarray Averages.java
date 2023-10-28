class Solution {
    public int[] getAverages(int[] nums, int k) {
        int [] res=new int[nums.length];
        long prefixSum[]=new long[nums.length];
        long pSum=0;
        for(int i=0;i<nums.length;i++){
            pSum+=nums[i];
            prefixSum[i] =  pSum;
        }        
        for(int i=0;i<nums.length;i++){
            if((i+k)<nums.length && (i-k)>=0){
                int size= k+k+1;
                if(i-k!=0){
                    res[i]=(int)((prefixSum[i+k]-prefixSum[i-k-1])/size);
                }else{
                    res[i]=(int)((prefixSum[i+k])/size);
                }
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}
