import java.util.*;
class Gutime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int ip=sc.nextInt();
        if(ip<60)
         System.out.print(0+" "+ip);
        else
        {
            int a=ip/60;
            int b=ip%60;
             System.out.print(a+" "+b);
        }
    }
}
