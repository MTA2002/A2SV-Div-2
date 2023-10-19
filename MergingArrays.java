import java.util.Scanner;
public class MergingArrays{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[m];
    int[] mergedArray=new int[n+m];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
      arr2[i]=sc.nextInt();
    }
    int i=0;
    int j=0;
    for(int k=0;k<m+n;k++){
      if(i<n && j<m){
          if(arr1[i]<arr2[j]){
              mergedArray[k]=arr1[i];
              i++;
          }else if(arr1[i]==arr2[j]){
              mergedArray[k]=arr1[i];
              k++;
              mergedArray[k]=arr2[j];
              i++;
              j++;
          }else{
              mergedArray[k]=arr2[j];
              j++;
          }
     }else if(i==n && j<m){
              mergedArray[k]=arr2[j];
              j++;
     }else if(i<n && j==m){
              mergedArray[k]=arr1[i];
              i++;
     }
    }
    for(int me:mergedArray){
      System.out.print(me+" ");
    }
  }
}

