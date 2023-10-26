class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();

        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer> pMap=new HashMap<>();

        for(int i=0;i<p.length();i++){
            if(pMap.get(p.charAt(i))!=null){
                pMap.put(p.charAt(i),pMap.get(p.charAt(i))+1);
            }else{
                pMap.put(p.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(sMap.get(s.charAt(i))!=null){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }else{
                sMap.put(s.charAt(i),1);
            }
            if(i>=(p.length()-1)){                 
                if(sMap.equals(pMap)){
                    ls.add(i-(p.length()-1));
                }
                char leftChar = s.charAt(i-(p.length()-1));
                sMap.put(leftChar, sMap.get(leftChar) - 1);
                if (sMap.get(leftChar) == 0) {
                    sMap.remove(leftChar);
                }
            }
        }
        return ls;

    }
}

