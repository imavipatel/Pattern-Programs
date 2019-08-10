/*WAP to print following Pattern.
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
*/
import java.util.Scanner;
public class NumberPattern18{
  public static void main(String[] args) {
    int k=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(k%2+" ");
        k++;
        //System.out.print(k);
        //k++
        //if(k>1)
        //k=0;
        /*
        k++;
        if(k%2==0)
        System.out.print("1");
        else
        System.out.print("0");
        //System.out.print(k++ +" ");
        */

      }
      System.out.println();
    }
  }
}
