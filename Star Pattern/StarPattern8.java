/*WAP to print following Pattern.
   *
  **
 ***
****
 ***
  **
   *
*/
public class StarPattern8{
  public static void main(String[] args) {
    int n = 7,sp = n/2, st = 1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=sp;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=st;j++){
        System.out.print("*");
      }
      if(i<=n/2){
        sp--;
        st++;
      }
      else
      {
        sp++;
        st--;
      }
      System.out.println();
    }
  }
}
