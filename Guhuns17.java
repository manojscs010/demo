import java.util.*;
class Guhuns17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int a[]=new int[n];
        
         int i=0,j=0,c=0,s=0;
         for(i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
           if(i%2!=0&&a[i]%2==0)
           {
               System.out.print(a[i]);
           }
           if(i%2==0&&a[i]%2!=0)
           {
               System.out.print(a[i]);
           }
        }
        
    }
}
