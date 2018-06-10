import java.io.*;
import java.util.*;
class Alpha
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
         char c=sc.next().charAt(0);
        if(c>='a'&&c<='z') 
          System.out.print("Alphabet");
         else
          System.out.print("No");
    }
}

