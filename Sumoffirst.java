import java.io.*;
import java.util.*;
class Sumoffirst
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
         int i=0,sum=0;
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
        for(i=0;i<m;i++)
        {
            sum=sum+a[i];
        }
        System.out.print(sum);
       
    }
}


