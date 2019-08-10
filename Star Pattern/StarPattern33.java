/*WAP to print following Pattern.
*     *******
*     *
*     *
*     *
*     *
*     *
*************
      *     *
      *     *
      *     *
      *     *
      *     *
*******     *

*/
import java.util.Scanner;
public class StarPattern33{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt(); //n=13
    System.out.println("The Pattern is : ");
    int k=1;
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=n;j++)
    {
      if(i==n/2+1||j==n/2+1||j==1&&i<=n/2||j==n&&i>n/2||i==1&&j>n/2||i==n&&j<=n/2)
      System.out.print("*");
      else
      System.out.print(" ");
    }
    System.out.println();
    }
  }
}
