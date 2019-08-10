/*
WAP to print the following pattern.
     1
    1*2
   1*2*3
  1*2*3*4
 1*2*3*4*5
 */
 import java.util.Scanner;
 public class NumberPattern31{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int n = sc.nextInt();
     System.out.println("The Pattern is : ");
     int k;
     for(int i=1;i<=n;i++)
     {
       //for(int j=1;j<=n-i;j++)
       for(int j=i;j<n;j++)
       {
         System.out.print(" ");
       }
       k=1;
       for(int j=1;j<=2*i-1;j++)
       {
         if(j%2==1)
         System.out.print(k++);
         else
         System.out.print("*");
       }
       System.out.println();
     }
   }
 }
