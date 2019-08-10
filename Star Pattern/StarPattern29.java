/*WAP to print following Pattern.
*******
**   **
* * * *
*  *  *
* * * *
**   **
*******
*/
import java.util.Scanner;
public class StarPattern29{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1;
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
      if(j==0||j==n-1||j==i||j==n-1-i||i==0||i==n-1)
      System.out.print("*");
      else
      System.out.print(" ");
    }
    System.out.println();
    }
  }
}
