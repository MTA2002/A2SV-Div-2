class Solution {
    public boolean judgeSquareSum(int c) {
       boolean judjement=false;
       long i=0;
       long j=(int)Math.sqrt(c);
       while(i<=j){
           long result=(i*i)+(j*j);
           if(result==c){
               judjement=true;
               break;
           }else if(result>c){
               j--;
           }else if(result<c){
               i++;
           }
       }
      return judjement;
    }
}
