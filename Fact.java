import java.util.*;
import java.io.*;
class Fact
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i=0,fact=1;
      for(i=n;i>=1;i--)
      {
          fact=fact*i;
      }
       System.out.print(fact);
        
    }
}



