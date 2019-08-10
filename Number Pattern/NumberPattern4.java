/*
WAP to print the following pattern
 00000
 11111
 00000
 11111
 00000
 */
 public class NumberPattern4{
   public static void main(String[] args) {
     int i,j, n=5;
     for(i=0;i<n;i++)
     {
       for(j=0;j<n;j++)
       {
         System.out.print(i%2);
       }
       System.out.println();
     }
   }
 }
