/*
WAP to print the following pattern.
1
2 5
3 6 8
4 7 9 10
*/
import java.util.Scanner;
public class NumberPattern37{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k;
    for(int i=1;i<=n;i++)
    {
      k=i;
      for(int j=1;j<=i;j++)
      {
        System.out.print(k+" ");
        k=k+n-j;
      }
      System.out.println();
    }
  }
}
