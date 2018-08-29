import java.util.*;
class Gustr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
        try
        {
            double i=Double.parseDouble(s);
            System.out.print("Yes");
        }
        catch(Exception e)
        {
            System.out.print("No");
        }
    }
}
