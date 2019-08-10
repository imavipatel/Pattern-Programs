/*
WAP to print the following pattern.
 AAAAA
 BBBBB
 CCCCC
 DDDDD
 EEEEE
 */
 public class AlphabetPattern1{
   public static void main(String[] args) {
     int i,j,k=65,n=5;
     for(i=1;i<=n;i++)
     {
       for(j=1;j<=n;j++)
       {
         System.out.print((char)k);
       }
       System.out.println();
       k++;
     }
   }
 }
