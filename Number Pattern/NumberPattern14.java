/*WAP to print following Pattern.
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1*/
import java.util.Scanner;
public class NumberPattern14{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j%2+" ");
        /*if(i%2!=0)
        System.out.print("1");
        else
        System.out.print("0");*/
      }
      System.out.println();
    }
  }
}
