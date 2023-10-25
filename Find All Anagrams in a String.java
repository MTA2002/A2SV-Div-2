class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int k=p.length();
        char [] cp=p.toCharArray();
        Arrays.sort(cp);
        char [] sp;
        
        for(int i=0;i<s.length();i++){
            if(i>=p.length()-1){
                sp=s.substring(i-(k-1),i+1).toCharArray();
                Arrays.sort(sp);
                if(Arrays.equals(sp,cp)){
                    ls.add(i-(k-1));
                }
            }
        }
        return ls;
    }
}

