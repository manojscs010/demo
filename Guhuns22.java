import java.util.*;
class Guhuns22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         int ip=sc.nextInt();
        int i=0; 
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         System.out.print(a[a.length-ip]);
    }
}
