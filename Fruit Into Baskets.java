class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int left=0;
       int right=0;
       int max=1;
       while(right<fruits.length){
            hm.put(fruits[right], hm.getOrDefault(fruits[right], 0) + 1);
            while(hm.size()>2){
                int fruitsLeft=fruits[left];
                hm.put(fruitsLeft, hm.get(fruitsLeft) - 1);
                if (hm.get(fruitsLeft) == 0) {
                    hm.remove(fruitsLeft);
                }
                left++;
            }
            max= Math.max(max,right-left+1);
            right++;
       }
       return max; 
    }
}
