/*WAP to print following Pattern.
   1
  222
 33333
4444444
 33333
  222
   1
*/
import java.util.Scanner;
public class NumberPattern35{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int s=n/2, k=1,l=1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=s;j++)
      {
      System.out.print(" ");
    }
    for(int j=1; j<=k;j++)
    {
      System.out.print(l);
    }
    if(i<=n/2)
    {
      s--;
      l++;
      k=k+2;
    }
    else
    {
      s++;
      l--;
      k=k-2;
    }
    System.out.println();
    }
  }
}
