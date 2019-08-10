/*
WAP to print the following pattern.
* * * *
* * *
* *
*
* *
* * *
* * * *
*/
import java.util.Scanner;
public class StarPattern24{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1,s=(n/2)+1; //s = star, sp = space
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=s;j++)
      {
        System.out.print("*"+" ");
      }
      if(i<=n/2)
      {
        s--;
      }
      else
      {
        s++;
      }
      System.out.println();
    }
  }
}
