import java.io.*;
import java.util.*;
class Max
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
         int i=0,max;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
         for(i=1;i<a.length;i++)
         {
             if(max<a[i])
             {
                 max=a[i];
             }
         }
         System.out.print(max);
    }
}

