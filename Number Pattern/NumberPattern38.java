/*
WAP to print the following pattern.
1
3  2
6  5  4
10 9  8  7
*/
import java.util.Scanner;
public class NumberPattern38{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1,l=2,m=1;
    for(int i=1;i<=n;i++)
    {
      m=k;
      for(int j=1;j<=i;j++)
      {
        System.out.print(m+" ");
        m--;
      }
      k=k+l;
      l++;
      System.out.println();
    }
  }
}
