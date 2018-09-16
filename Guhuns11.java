import java.util.*;
class Guhuns11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
        int i=0,j=0,k=0;
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int b[]=new int[n];
         for(i=0;i<n;i++)
         {
             for(j=i+1;j<n;j++)
             {
                 if(a[i]==a[j])
                 {
                     b[k]=a[i];
                     ++k;
                     break;
                 }
             }
         }
         Arrays.sort(b);
         for(i=0;i<n;i++)
         {
             if(b[i]!=0)
               System.out.print(b[i]+" ");
         }
    }   
}
