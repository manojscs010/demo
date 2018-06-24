import java.util.*;
import java.io.*;
class Oddtwo
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       int i=0;
      for(i=m+1;i<=n-1;i++)
      {
          if(i%2==0)
            System.out.print(i);
      }
     
    }
}
