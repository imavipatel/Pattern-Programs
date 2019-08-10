/*WAP to print following Pattern.
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
public class StarPattern10{
  public static void printNumber(int n){
    int i,j;
    for(i=1; i<=n; i++){
      for(j=1;j<=i;j++){
        if(j<i)
          System.out.print(i+"*");
        else
        System.out.print(i);
      }
      System.out.println();
    }
    for(i=n;i>=1;i--){
      for(j=1;j<=i;j++){
        if(j<i)
        System.out.print(i+"*");
        else
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int n = 5;
    printNumber(n);
  }
}
