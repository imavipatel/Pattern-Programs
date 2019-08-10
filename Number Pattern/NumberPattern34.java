/*WAP to print following Pattern.
   1
  101
 10101
1010101
 10101
  101
   1
*/
import java.util.Scanner;
public class NumberPattern34{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int s = n/2, k = 1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=s;j++)
      {
      System.out.print(" ");
    }
    int l=1;
    for(int j=1; j<=k;j++)
    {
      System.out.print(l%2);
      l++;
    }
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
