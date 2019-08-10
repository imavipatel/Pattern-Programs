/*WAP to print following Pattern.
*
**
***
****
*****
*****
****
***
**
*
*/
public class StarPattern9{
  public static void main(String[] args) {
    int i , j;
    for(i=1;i<=5; i++){
      for(j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int p=5;p>=1; p--){
      for(int q=1; q<=p;q++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
