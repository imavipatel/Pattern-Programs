/*WAP to print following Pattern.
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
*/
import java.util.Scanner;
public class NumberPattern16{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(i%2+" ");
      }
      System.out.println();
    }
  }
}
