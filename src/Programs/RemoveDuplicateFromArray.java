package Programs;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	
    public static void main(String[] args) {
        int[] a = {1,2,2,3,6,6,6};
       Arrays.sort(a);
       int len=a.length;
       
       int[] result= new int[len];
       
       int j=0;
       
       for(int i=0;i<len-1;i++)
       {
    	   if(a[i]!=a[i+1])
    	   {
    		   
    		   result[j]=a[i];
    		   j++;
    	   }
       }
       result[j++]=a[len-1];
       
      for(int k=0;k<j;k++)
      {
    	  System.out.print(result[k]);
      }
        }
    }


