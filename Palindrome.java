import java.util.*;
import java.io.*;
class Palindrome
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String str="";
      int n=Integer.parseInt(s);
      int c;
      //System.out.print(n);
       while(n>0)
       {
           c=n%10;
           n=n/10;
           str=str+String.valueOf(c);
       }
       if(str.equals(s))
        System.out.print("palindrome");
      else
       System.out.print("not palindrome");
    }
}

