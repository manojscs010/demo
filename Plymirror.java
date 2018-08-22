import java.util.*;
class Plymirror
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
         int i=0,j=n-1,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
         for(i=0;i<a.length;i++)
         {
             if(a[i]==b[j])
             {
                 ++c;
             }
             --j;
         }
         if(c==n)
          System.out.print("yes");
         else
          System.out.print("no");
    }
}
