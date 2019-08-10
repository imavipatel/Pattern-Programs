/*WAP to print following Pattern.
   1
  1*2
 1*2*3
1*2*3*4
 1*2*3
  1*2
   1
*/
import java.util.Scanner;
public class NumberPattern32{
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
      if(j%2==0)
      System.out.print("*");
      else
      {
        System.out.print(l);
        l++;
      }
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
