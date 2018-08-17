import java.util.*;
class Star
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
        String s2[]=s.split("\\s");
         int i=0,j=0,k=0;
        String s3[]=new String[s2.length]; 
        for(i=0;i<s2.length;i++) 
        {
            if(s2[i].length()==1)
             s3[i]=s2[i].toUpperCase();
            else
            {
                s3[i]="";
                s3[i]=s3[i]+(String.valueOf(s2[i].charAt(0))).toUpperCase();
                 k=i;
                for(j=1;j<s2[i].length();j++)
                  s3[k]=s3[k]+String.valueOf(s2[k].charAt(j));
            }
        }
        for(i=0;i<s3.length;i++)
        {
            //if(s3[i]!=null)
         System.out.print(s3[i]+" ");
        }
          //System.out.println(s3[1]);
    }
  
  }

