#include"stdio.h"
#include"conio.h"
#include"string.h"
void main()
{
 char a[30]="kumar raj kumar";
 int i,c=0,f;
  clrscr();
 for(i=0;i<30;i++)
 {
  if(a[i]!=' '&&a[i]!='\0')
     c++;
 }
 printf("%d",c);
 getch();
}