/*
WAP to print the following pattern
 00000
 11111
 00000
 11111
 00000
 */
 public class NumberPattern5{
   public static void main(String[] args) {
     int i,j,n=5;
     for(i=1;i<=n;i++)
     {
       for(j=1;j<=n;j++)
       {
         if(i%2==0)
         System.out.print("1");
         else
         System.out.print("0");
       }
       System.out.println();
     }
   }
 }
