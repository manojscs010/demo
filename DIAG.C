#include"stdio.h"
#include"conio.h"
void main()
{
 int a[3][3],i,j,sum=0,sum1=0,e,n;
  clrscr();
 printf("enter the natrix:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    scanf("%d",&a[i][j]);
   }
  }
  for(i=0;i<3;i++)
  {
   for(j=i;j<i+1;j++)
   {
    sum=sum+a[i][j];
   }
  }
 n=2;
 for(i=0;i<3;i++)
 {
  for(j=n;j<n+1;j++)
  {
   sum1=sum1+a[i][j];
  }
  n--;
 }
 e=sum*sum1;
  printf("%d",e);
 getch();
}