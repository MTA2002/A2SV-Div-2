class Solution {
    public String largestMerge(String word1, String word2) {
        String merge="";
        int i=0;
        int j=0;
        while((i+j)<(word1.length() + word2.length())){
            if(i<word1.length() && j<word2.length()){
                if(word1.charAt(i)>word2.charAt(j)){
                    merge+=word1.charAt(i);
                    i++;
                }else if(word1.charAt(i)<word2.charAt(j)){
                    merge+=word2.charAt(j);
                    j++;
                }else{
                    if(word1.substring(i).compareTo(word2.substring(j))>0){
                        merge+=word1.charAt(i);
                        i++;
                    }else{
                        merge+=word2.charAt(j);
                        j++; 
                    }
                }
            }else if(i==word1.length()){
                merge+=word2.charAt(j);
                j++;
            }else{
                merge+=word1.charAt(i);
                i++;
            }
        }
        return merge;
    }
}

       
