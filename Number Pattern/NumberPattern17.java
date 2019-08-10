/*WAP to print following Pattern.
1
2 3
4 5 6
7 8 9 1
2 3 4 5 6
*/
import java.util.Scanner;
public class NumberPattern17{
  public static void main(String[] args) {
    int k=1; //k=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        //System.out.print(k%9+1);
        //k++;
        System.out.print(k +" ");
        k++;
        if(k==10)//if(k>9)
        k=1;
      }
      System.out.println();
    }
  }
}
