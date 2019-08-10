/*
WAP to print the following pattern.
ABCDE
 ABCD
  ABC
   AB
    A
   AB
  ABC
 ABCD
ABCDE
*/
import java.util.Scanner;
public class AlphabetPattern12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int k=1,s=(n/2)+1,sp=0;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=sp;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=s;j++)
      {
        System.out.print((char)(j+64));
      }
      if(i<=n/2)
      {
        s--;
        sp++;
      }
      else
      {
        s++;
        sp--;
      }
      System.out.println();
    }
  }
}
