/*WAP to print following Pattern.
*
**
***
****
***
**
*
*/
import java.util.Scanner;
public class StarPattern25{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("The Pattern is : ");
    int s=1;
    for(int i=1;i<=n;i++){
      /*for(int j=1;j<=s;j++){
        System.out.print("");
      }
      */
      for(int j=1;j<=s;j++){
        System.out.print("*");
      }
      if(i<=n/2){
        s++;
      }
      else
      {
        s--;
      }
      System.out.println();
    }
  }
}
