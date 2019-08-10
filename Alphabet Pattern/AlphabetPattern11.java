/*
WAP to print the following pattern.
A B C D E
 A B C D
  A B C
   A B
    A
   A B
  A B C
 A B C D
A B C D E
*/
import java.util.Scanner;
public class AlphabetPattern11{
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
        System.out.print((char)(j+64)+" ");
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
