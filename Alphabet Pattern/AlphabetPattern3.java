/*
WAP to print following pattern.
 A
 AB
 ABC
 ABCD
 ABCDE
 */
 public class AlphabetPattern3{
   public static void main(String[] args) {
     for(int i=1;i<=5;i++)
     {
       for(int j=1;j<=i;j++)
       {
         System.out.print((char)(j+64));
       }
       System.out.println();
     }
   }
 }
