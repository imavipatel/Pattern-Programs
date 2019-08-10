/*
WAP to print the following pattern.
    1
   010
  10101
 0101010
101010101
 */
 import java.util.Scanner;
 public class NumberPattern36{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int n = sc.nextInt();
     System.out.println("The Pattern is : ");
     int k=1;
     for(int i=1;i<=n;i++)
     {
       //for(j=n;j>i;j--)
       //for(int j=1;j<=n-i;j++)
       for(int j=i;j<n;j++)
       {
         System.out.print(" ");
       }
       for(int j=1;j<=2*i-1;j++)
       {

         System.out.print(k%2);
         k++;
       }
       System.out.println();
     }
   }
 }
