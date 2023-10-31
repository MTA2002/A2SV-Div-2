class Solution {
    public int subarraySum(int[] nums, int k) {
        int size=nums.length;
        int prefixSum[]=new int[size];
        int count=0;

        prefixSum[0]=nums[0];
        for(int i=1;i<size;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        
        for(int i=0;i<size;i++){
           for(int j=i;j<size;j++){
               if(i==0){
                    if(prefixSum[j]==k){
                        count++;
                    }
               }else{
                   if(prefixSum[j]-prefixSum[i-1]==k){
                         count++;
                    }
               }       
            } 
        }
        return count;
    }
}
