class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int prefixProduct=1;
        int suffixProduct=1;
        int prefixProducts[] = new int [size];
        int suffixProducts[] = new int [size];
        int j=size-1;
        for(int i=0;i<size;i++){
            prefixProduct *= nums[i];
            suffixProduct *= nums[j];
            prefixProducts[i]=prefixProduct;
            suffixProducts[j]=suffixProduct;
            j--;
        }
        for(int i=0;i<size;i++){
            if(i==0){
                nums[i]=suffixProducts[i+1];
            }else if(i==size-1){
                nums[i]=prefixProducts[i-1];
            }else{
                nums[i]=prefixProducts[i-1]*suffixProducts[i+1];
            }
        }
        return nums;
    }
}

