/*
WAP to print the following pattern.
 A
 BC
 DEF
 GHIJ
 KLMNO
 */
 public class AlphabetPattern4{
   public static void main(String[] args) {
     int n=5,k=65;
     for(int i=1;i<=n;i++)
     {
       for(int j=1;j<=i;j++)
       {
         System.out.print((char)k);
         k++;
       }
       System.out.println();
     }
   }
 }
