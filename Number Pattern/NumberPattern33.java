/*
WAP to print the following pattern.
1234321
 12321
  121
   1
  121
 12321
1234321
*/
import java.util.Scanner;
public class NumberPattern33{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k,s=n,sp=0; //s = star, sp = space
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=sp;j++)
      {
        System.out.print(" ");
      }
      k=1;
      for(int j=1;j<=s;j++)
      {
        System.out.print(k);
        if(j<=s/2)
        k++;
        else
        k--;
      }
      if(i<=n/2)
      {
        s=s-2;
        sp++;
      }
      else
      {
        s=s+2;
        sp--;
      }
      System.out.println();
    }
  }
}
