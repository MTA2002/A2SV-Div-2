class Solution {
    public int maxTurbulenceSize(int[] arr) {
       int i=0;
       int j=1;
       int max=0;
       if(arr.length==1){
           return 1;
       }
       while(j<arr.length){
            if(((j-1)%2)==0){
                if(arr[j-1]<=arr[j]){
                    max=Math.max(max,j-i);
                    while(i<j){
                        i++;
                    }
                }
            }else{
                if(arr[j-1]>=arr[j]){
                    max=Math.max(max,j-i);
                    while(i<j){
                        i++;
                    }
                }
            }
            max=Math.max(max,j+1-i);
            j++;
       }
       j=1;
       i=0;
       while(j<arr.length){
            if(((j-1)%2)==0){
                if(arr[j-1]>=arr[j]){
                    max=Math.max(max,j-i);
                    while(i<j){
                        i++;
                    }
                }
            }else{
                if(arr[j-1]<=arr[j]){
                    max=Math.max(max,j-i);
                    while(i<j){
                        i++;
                    }
                }
            }
                    max=Math.max(max,j+1-i);
            j++;
       }
       return max; 
    }
}
