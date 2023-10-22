class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }
        List<Integer> ls=new ArrayList<>();
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int index=hm.get(s.charAt(i));
            max=Math.max(max,index);
            if(i==max){
                ls.add(i+1-sum);
                sum=i+1;
            }
        }
        return ls;
    }
}
