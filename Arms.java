import java.util.*;
import java.io.*;
class Arms
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int n1=n;
       int c=0,sum=0;
       while(n1>0)
       {
           c=n1%10;
           n1=n1/10;
           sum=sum+c*c*c;
       }
       if(sum==n)
        System.out.print("yes");
      else
       System.out.print("no");
    }
}



