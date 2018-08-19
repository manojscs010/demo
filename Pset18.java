import java.util.*;
class Pset18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String s1[]=s.split("\\s");
          String str="",str1="",s8="",s2="";
          int i=0;
         String s3[]=new String[s1.length];
          for(i=0;i<s1.length;i++)
          {
              str=s1[i].substring(0,1);
              str1=s1[i].substring(1);
              s8=str.toUpperCase();
              s2=str1.toLowerCase();
             s3[i]=s8+s2;
             System.out.print(s3[i]+" ");
              str="";str1="";s8="";s2="";
          }
      
    }
}
