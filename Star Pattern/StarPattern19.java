/*
WAP to print the following Pattern.
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

import java.util.Scanner;
public class StarPattern19{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k;
    for(int i=1;i<=n;i++)
    {
      //for(int j=1;j<=2*i-1;j++)
      for(int j=1;j<(2*i);j++)
      {
        if(j%2==0)
        System.out.print("*");
        else
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
