import java.util.*;
class Gumed2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
         int i=0;
          for(i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
          Arrays.sort(a);
          //for(i=0;i<n;i++)
         System.out.print(a[n/2]+" "); 
          
    }
}
