import java.io.*;
import java.util.*;
class Sumof
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int i=0,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
       
    }
}


