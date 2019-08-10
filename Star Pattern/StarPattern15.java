/*
WAP to print the following pattern.
    *
   ***
  *****
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
public class StarPattern15{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1,s=n/2;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=s;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=k;j++)
      {
        System.out.print("*");
      }
      //System.out.println();
      if(i<=n/2)
      {
        s--;
        k=k+2;
      }
      else
      {
        s++;
        k=k-2;
      }
      System.out.println();
    }
  }
}
