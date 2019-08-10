/*
WAP to print following pattern.
 10101
 01010
 10101
 01010
 10101
 */
 public class NumberPattern3{
   public static void main(String[] args) {
     int i, j, n=5, k=1;
     for(i=1;i<=n;i++)
     {
       for(j=1;j<=n;j++)
       {
         System.out.print(k%2);
         k++;
       }
       System.out.println();
     }
   }
 }
