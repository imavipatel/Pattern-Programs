/*WAP to print following Pattern.
*****
*/
import java.util.Scanner;
public class StarPattern2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++)
    {
      System.out.print("*");
    }
  }
}
