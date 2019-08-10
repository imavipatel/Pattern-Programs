/*
WAP to print the following pattern.
    *
   **
  ***
 ****
*****
*/
import java.util.Scanner;
public class StarPattern12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=0;
    for(int i=1;i<=n;i++)
    {
      //for(int j=1;j<=n-i;j++)
      for(int j=n;j>i;j--)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
