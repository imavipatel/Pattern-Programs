/*
WAP to print the following pattern.
     A
    BCD
   EFGHI
  JKLMNOP
 QRSTUVWXY
ZABCDEFGHIJ
 */
 import java.util.Scanner;
 public class AlphabetPattern10{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int n = sc.nextInt();
     System.out.println("The Pattern is : ");
     int k=1;
     for(int i=1;i<=n;i++)
     {
       //for(int j=1;j<=n-i;j++)
       for(int j=i;j<n;j++)
       {
         System.out.print(" ");
       }
       for(int j=1;j<=2*i-1;j++)
       {
         System.out.print((char)(k+64));
         k++;
         if(k==27)
         k=1;
       }
       System.out.println();
     }
   }
 }
