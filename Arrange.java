package manoj;
import java.util.*;
public class Arrange {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a[]=new int[n];
       int i=0,d=0;
        String str="";
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
         for(i=n-1;i>=0;i--)
         {
        	 str=str+String.valueOf(a[i]);
         }
         d=Integer.parseInt(str);
         if(d>0)
        	 System.out.println(d);
         else
        	 System.out.println("0");
	}

}
