/*
WAP to print the following pattern.
    A
   BC
  DEF
 GHIJ
KLMNO
*/
public class AlphabetPattern6{
  public static void main(String[] args) {
    int n=5,k=65;
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<n;j++)
      //for(int j=0;j<n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print((char)k);
        k++;
      }
      System.out.println();
    }
  }
}
