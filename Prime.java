import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         if((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0))
         {
             System.out.print("yes");
         }
         else
         {
             System.out.print("no");
         }
    }
}
