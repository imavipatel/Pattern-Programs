/*
WAP to print the following pattern.
*********
 *******
  *****
   ***
    *
 */
 import java.util.Scanner;
 public class StarPattern20{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int n = sc.nextInt();
     System.out.println("The Pattern is : ");
     for(int i=n;i>=1;i--)
     {
       //for(int j=1;j<=n-i;j++)
       for(int j=i;j<n;j++)
       {
         System.out.print(" ");
       }
       for(int j=1;j<=2*i-1;j++)
       {
         System.out.print("*");
       }
       System.out.println();
     }
   }
 }
