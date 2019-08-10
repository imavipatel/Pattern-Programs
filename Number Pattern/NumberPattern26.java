/*
WAP to print the following pattern.
12345
 1234
  123
   12
    1
*/
import java.util.Scanner;
public class NumberPattern26{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
