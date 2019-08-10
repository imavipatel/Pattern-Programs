/*WAP to print following Pattern.
   A
  ABA
 ABCBA
ABCDCBA
 ABCBA
  ABA
   A
*/
import java.util.Scanner;
public class AlphabetPattern16{
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
      l=1;
    for(int j=1; j<=k;j++)
    {
      System.out.print((char)(l+64));
      if(j<=k/2)
      l++;
      else
      l--;
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
