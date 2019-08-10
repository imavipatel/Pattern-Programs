/*
WAP to print following pattern.
 10101
 01010
 10101
 01010
 10101
 */
 public class NumberPattern2{
   public static void main(String[] args) {
     int k = 1;
     for(int i=1; i<=5; i++)
     {
       for(int j=1; j<=5; j++)
       {
         System.out.print(k);
         if(k==1)
         k--;
         else
         k++;
       }
       System.out.println();
     }
   }
 }
