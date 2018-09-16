import java.util.*;
class Gutimed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int hr=sc.nextInt();
          int min=sc.nextInt();
         int hr1=sc.nextInt();
         int min1=sc.nextInt();
        int a=Math.abs(hr-hr1);
        int b=Math.abs(min-min1);
         System.out.print(a+" "+b);
    }
}
