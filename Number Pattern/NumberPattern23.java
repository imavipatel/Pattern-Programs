/*
WAP to print the following pattern.
 12345
 12345
 12345
 12345
 12345
 */
import java.util.Scanner;
public class NumberPattern23{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
