class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numsArray = new Integer[nums.length];
        for(int i = 0;i<nums.length;i++) {
            numsArray[i] = nums[i];
        }
        
        String result="";

        Comparator<Integer> myComparotor = new Comparator<Integer>() {
            public int compare(Integer x, Integer y){
                String order1=String.valueOf(x)+String.valueOf(y);
                String order2=String.valueOf(y)+String.valueOf(x);
                if(order1.compareTo(order2)>0){
                    return -1;
                }else if(order1.compareTo(order2)<0){
                    return 1;
                }
                return 0;
            }
        };
       
        Arrays.sort(numsArray,myComparotor);
        if(numsArray[0]==0){
            return "0";
        }
        for(Integer i:numsArray){
            result+=i;
        }
        return result;
    }
}
