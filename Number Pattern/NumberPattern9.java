/*
WAP to print the following pattern.
 1*0*1
 1*0*1
 1*0*1
 1*0*1
 */
 public class NumberPattern9{
   public static void main(String[] args) {
     int i,j,n=5;
     for(i=1;i<=n;i++)
     {
       for(j=1;j<=n;j++)
       {
         if(j%2==0)
         System.out.print("*");
         else if(j==3)
         System.out.print("0");
         else
         System.out.print("1");
       }
       System.out.println();
     }
   }
 }
