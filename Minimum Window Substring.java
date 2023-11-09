class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        String result="";
        int min=s.length();
        for(char c:t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
            window.put(c,0);
        }
        int j=0;
        int i;
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(window.containsKey(c)){
                window.put(c,window.get(c)+1);
            }
            while(compareHashMapValues(window,tMap)){
                if(window.containsKey(s.charAt(j))){
                    window.put(s.charAt(j),window.get(s.charAt(j))-1);
                }
                if((i-j)<min){
                    min=(i-j);
                    if(j>=0 && i+1<s.length()){
                        result=s.substring(j,i+1);
                    }else if(i+1==s.length() && j>=0){
                        result=s.substring(j);
                    }
                }
                j++;
            }
            
        }
        return result;
    }
    public boolean compareHashMapValues(HashMap<Character, Integer> a, HashMap<Character, Integer> b) {
    for (Character key : a.keySet()) {
        int valueA = a.get(key);
        int valueB = b.get(key);
        if (valueA < valueB) {
            return false; 
        }
    }
    return true; 
}

}
