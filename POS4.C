#include"stdio.h"
#include"conio.h"
void main()
{
 int i,j,k,n=2;
  clrscr();
 for(i=0;i<5;i++)
 {
  for(j=i;j<i+1;j++)
  {
   for(k=1;k<=n;k++)
   {
    if((i==0||i==2||i==4)&&(k%2!=0))
      printf("%d",k);
    if((i==1||i==3)&&(k%2==0))
      printf("%d",k);
   }
   n=n+2;
  }
  printf("\n");
 }
 getch();
}