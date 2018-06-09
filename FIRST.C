#include"stdio.h"
#include"conio.h"
void main()
{
 int n;
  clrscr();
  scanf("%d",&n);
 if(n>0)
  printf("POSITIVE");
 else if(n<0)
  printf("NEGATIVE");
 else
  printf("ZERO");
 getch();
}