class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int longest=0;
        HashSet<Character> arr = new HashSet<>();
        while(j<s.length()){
            if(arr.contains(s.charAt(j))){
                while(arr.contains(s.charAt(j))){
                    arr.remove(s.charAt(i));
                    i++;
                }
            }else{
                arr.add(s.charAt(j));
                longest=Math.max(longest,j-i+1);
                j++;
            }
        }
        return longest;
    }
}


