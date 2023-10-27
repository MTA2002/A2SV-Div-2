class NumArray {
    int [] prefixSums;
    public NumArray(int[] nums) {
        prefixSums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixSums[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left!=0){
           return prefixSums[right] - prefixSums[left-1];
        }
        return prefixSums[right];
    }
}
