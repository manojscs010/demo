#include"stdio.h"
#include"conio.h"
#include"stdlib.h"
struct node
{
 int data;
 struct node* link;
};
struct node* head=NULL;
void create(int a)
{
 struct node* new;
 new=(struct node*)malloc(sizeof(struct node));
  new->data=a;
  new->link=NULL;
 if(head==NULL)
  head=new;
 else
 {
  struct node* temp=head;
   while(temp->link!=NULL)
   {
    temp=temp->link;
   }
   temp->link=new;
 }
}
void display()
{
struct node* dis=head;
 while(dis!=NULL)
 {
  printf("%d",dis->data);
  dis=dis->link;
 }
}
void del()
{
 struct node* del=head;
  if(del!=NULL)
  {
   head=del->link;
   free(del);
  }
}
void delkey(int c)
{
 struct node* delk=head;
  while(delk!=NULL)
  {
   if(delk->data==c)
   {
    head->link=delk->link;
    free(delk);
   }
   else
   {
    delk=delk->link;
   }
  }
}
void main()
{
 clrscr();
 create(12);
 create(23);
 create(24);
 create(25);
 create(26);
 display();
  printf("\n");
// del();
 //display();
  printf("\n");
 delkey(25);
 display();
  printf("\n");
 getch();
}