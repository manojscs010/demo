#include"stdio.h"
#include"conio.h"
void main()
{
 int a[5],i,c,x,j;
  clrscr();
 printf("enter the array elements:");
 for(i=0;i<5;i++)
 {
  scanf("%d",&a[i]);
 }
 printf("enter the x value:");
  scanf("%d",&x);
 for(i=0;i<5;i++)
 {
  for(j=i;j<5;j++)
  {
   c=a[i]+a[j];
  if(c==x)
  {
   printf("yes");
    break;
   }
   if(c!=x)
    printf("no");
  }
 }
  getch();
}