class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[]=new int[m+n];
        int nums1Pointer=0;
        int nums2Pointer=0;
        for(int i=0;i<m+n;i++){
            if(nums1Pointer<m && nums2Pointer<n){
                if(nums1[nums1Pointer]<nums2[nums2Pointer]){
                    merged[i]=nums1[nums1Pointer];
                    nums1Pointer++;
                }else if(nums1[nums1Pointer]>nums2[nums2Pointer]){
                    merged[i]=nums2[nums2Pointer];
                    nums2Pointer++;
                }else{
                    merged[i]=nums1[nums1Pointer];
                    i++;
                    merged[i]=nums2[nums2Pointer];
                    nums1Pointer++;
                    nums2Pointer++;
                }
            }else if(nums1Pointer==m && nums2Pointer<n){
                merged[i]=nums2[nums2Pointer];
                nums2Pointer++;
            }else if(nums1Pointer<m && nums2Pointer==n){
                merged[i]=nums1[nums1Pointer];
                nums1Pointer++;
            }
        }
        for(int i=0;i<merged.length;i++){
            nums1[i]=merged[i];
        }
    
    }
}
