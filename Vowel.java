import java.io.*;
import java.util.*;
class Vowel
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        char c=0;
          c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
         System.out.print("Vowel");
        else
         System.out.print("consonant");
    }
}

