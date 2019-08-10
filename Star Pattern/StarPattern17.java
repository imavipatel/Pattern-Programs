/*
WAP to print the following Pattern.
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/

import java.util.Scanner;
public class StarPattern17{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k;
    for(int i=1;i<=n;i++)
    {
      k=n;
      //for(int j=1;j<=2*i-1;j++)
      for(int j=1;j<(2*i);j++)
      {
        if(j%2==0)
        System.out.print("*");
        else
        System.out.print(k--);
      }
      System.out.println();
    }
  }
}
