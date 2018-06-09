#include"stdio.h"
#include"conio.h"
void main()
{
  char c;
   clrscr();
   printf("enter any character:");
    scanf("%c",&c);
   if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
    {
    printf("it is an alphabet");
    }
   else
   {
   printf("not alphabet");
   }
 getch();
}