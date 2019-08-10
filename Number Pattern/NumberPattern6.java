/*
WAP to print the following pattern.
 12345
 67891
 23456
 78912
 34567
 */
 public class NumberPattern6{
   public static void main(String[] args) {
     int i,j,n=5,k=1;
     for(i=1;i<=n;i++)
     {
       for(j=1;j<=n;j++)
       {
         System.out.print(k);
         k++;
         if(k>9)
         {
           k=1;
         }
       }
       System.out.println();
     }
   }
 }
