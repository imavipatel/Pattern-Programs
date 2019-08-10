/*
WAP to print the following pattern.
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/
public class AlphabetPattern5{
  public static void main(String[] args) {
    int n=6,k;
    for(int i=1;i<=n;i++)
    {
      k=64;
      for(int j=1;j<=i;j++)
      {
        System.out.print((char)(i+k));
        k++;
      }
      System.out.println();
    }
  }
}
