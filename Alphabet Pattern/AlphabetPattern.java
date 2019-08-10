/*
WAP to print the following pattern.
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 */
 public class AlphabetPattern{
   public static void main(String[] args) {
     int i,j,k,n=5;
     for(i=1;i<=n;i++)
     {
       k = 65;
       for(j=1;j<=n;j++)
       {
         System.out.print((char)k);
         k++;
       }
       System.out.println();
     }
   }
 }
