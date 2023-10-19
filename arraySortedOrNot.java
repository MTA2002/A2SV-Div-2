
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean sorted=true;
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]>arr[j]){
                sorted=false;
                break;
            }
            i++;
            j++;
        }
        return sorted;
        
    }
}
