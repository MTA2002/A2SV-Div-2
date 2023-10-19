class Solution {
    public String frequencySort(String s) {
        Comparator<String> com=new Comparator<String>(){
            public int compare(String a, String b){
            if(a.length()<b.length()){
                return 1;
            }else if(a.length()>b.length()){
                return -1;
            }
            return 0;
            }
        };
        char[] c=s.toCharArray();
        Arrays.sort(c);
        s=new String(c);
        ArrayList<String> as=new ArrayList<>();
        String sn="";
        for(int i=0;i<s.length();i++){
            sn+=String.valueOf(s.charAt(i));
            if(i+1<s.length())
                if(s.charAt(i)!=s.charAt(i+1)){
                    as.add(sn);
                    sn="";
                }
        }
        as.add(sn);
        Collections.sort(as,com);
        String result="";
        for(String str:as){
            result+=str;
        }
        return result;
    }
}
