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
public class StarPattern23{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1,s=1,sp=n/2; //s = star, sp = space
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=sp;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=s;j++)
      {
        System.out.print("*");
      }
      if(i<=n/2)
      {
        s=s+2;
        sp--;
      }
      else
      {
        s=s-2;
        sp++;
      }
      System.out.println();
    }
  }
}
