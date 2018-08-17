import java.util.*;
class Rec
{
    public static void main(String args[])
    {
        System.out.println(rec(10));
        System.out.println(rec(33));
        System.out.println(rec(24));
    }
    public static int rec(int a)
    {
       // int b=1;
        if(a%2==0)
        {
            a=a/2;
            return rec(a);
        }
        else
          return a;
    }
  }

