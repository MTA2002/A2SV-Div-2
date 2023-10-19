import java.util.Scanner;
public class NumberofSmaller {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[m];
    int[] newArray=new int[m];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
      arr2[i]=sc.nextInt();
    }
    int i=0;
    int j=0;
    while(j<m){
      if(i<n){
        if(arr1[i]<arr2[j]){
            i++;
        }else{
          newArray[j]=i;
          j++;
        }
      }else{
         newArray[j]=i;
         j++; 
      }
    }
    for(int ne:newArray){
      System.out.print(ne+" ");
    }
  }
}
