class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=1;
        String res="";
        if(chars.length==1){
            return 1;
        }
        while(j<chars.length){
            if(chars[j]!=chars[i]){
                res+=chars[i];
                if(j-i>1){
                    res+=j-i;
                }
                i=j;
            }
            if(j==chars.length-1){
                res+=chars[i];
                if(j-i>=1){
                    res+=j-i+1;
                }
            }
            j++;
        }
        for(i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}
