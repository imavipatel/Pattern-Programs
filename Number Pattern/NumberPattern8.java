/*
WAP to print the following pattern.
1*1*1
0*0*0
1*1*1
0*0*0
1*1*1
*/
public class NumberPattern8{
  public static void main(String[] args) {
    int i,j,n=5;
    for(i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        for(j=1;j<=n;j++)
        {
          if(j%2==1)
          System.out.print("0");
          else
          System.out.print("*");
        }
      }
      else
      {
        for(j=1;j<=n;j++)
        {
          if(j%2==1)
          System.out.print("1");
          else
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
