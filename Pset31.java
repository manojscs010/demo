import java.util.*;
class Pset31
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
         String s2=sc.next();
         int k=sc.nextInt();
        int i=0,j=0,c=0;;
         for(i=0;i<s.length();i++)
         {
             for(j=i;j<i+1;j++)
             {
                 if(s.charAt(i)!=s2.charAt(j))
                 ++c;
             }
         }
        if(c==k)
         System.out.print("YES");
        else
         System.out.print("NO");
    }
}
