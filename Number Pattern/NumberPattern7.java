/*
WAP to print the following pattern.
1*1*1
1*1*1
1*1*1
1*1*1
1*1*1
*/
public class NumberPattern7{
  public static void main(String[] args) {
    int i,j,n=5,k=1;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(j%2==1)
        System.out.print("1");
        else
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
