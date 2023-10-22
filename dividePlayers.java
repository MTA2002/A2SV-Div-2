class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long validSum=skill[i]+skill[j];
        long chemistry=0;
        while(i<j){
            long sum=skill[i]+skill[j];
            if(sum==validSum){
                chemistry+=skill[i]*skill[j];
            }else{
                chemistry=-1;
                break;
            }
            i++;
            j--;
        }
        return chemistry;
    }
}
