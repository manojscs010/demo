import java.io.*;
import java.util.*;
class Numberof
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int c,d=0;
        while(n>0)
        {
            c=n%10;
            n=n/10;
            d++;
        }
        System.out.print(d);
    
       
    }
}


