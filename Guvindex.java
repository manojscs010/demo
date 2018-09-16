import java.util.*;
class Guvindex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
        int i=0,j=0,k=0,c=0;
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
        for(i=0;i<n;i++)
        {
            if(i==a[i])
            {
             System.out.print(a[i]+" ");
             ++c;
            }
        }
        if(c==0)
         System.out.print("-1");
    }   
}
