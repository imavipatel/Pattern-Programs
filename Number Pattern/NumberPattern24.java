/*
WAP to print the following pattern.
1*3*5
1*3*5
1*3*5
1*3*5
1*3*5
 */
 import java.util.Scanner;
 public class NumberPattern24{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int n = sc.nextInt();
     System.out.println("The Pattern is : ");
     int k;
     for(int i=1;i<=n;i++)
     {
       k = 1;
       for(int j=1;j<=n;j++)
       {
         if(j%2==0)
         System.out.print("*");
         else
         System.out.print(k);
         k++;
       }
       System.out.println();
     }
   }
 }
