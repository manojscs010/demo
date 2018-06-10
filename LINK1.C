#include"stdio.h"
#include"conio.h"
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
void addbeg(int b)
{
  //struct node* temp=head;
 struct node* new;
 new=(struct node*)malloc(sizeof(struct node));
 new->data=b;
 new->link=head;
 head=new;
}
void del(int c)
{
  struct node* del=head;
  if(del!=NULL&&del->data==c)
  {
   head=del->link;
   free(del);
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
void main()
{
 clrscr();
  create(90);
  create(100);
  display();
  printf("\n");
 addbeg(89);
  display();
  printf("\n");
 del(89);
  display();
  printf("\n");
 getch();
}