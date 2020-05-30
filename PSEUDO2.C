#include<stdio.h>
#include<string.h>
#include<conio.h>
struct node
{
char name[50];
int mon;
char dan[50];
struct node *link;
};
//struct node *newnode;
struct node *first=NULL;
struct node *temp=NULL;
struct node *next=NULL;
struct node *next1=NULL;
 FILE *fp;
void insert()
{
struct node* newnode=(struct node*)malloc(sizeof(struct node));
printf("\nEnter name of the participant\n");
scanf("%s",&newnode->name);
printf("\nEnter month-no joined\n");
scanf("%d",&newnode->mon);
printf("\nDance style choosen-\n");
scanf("%s",&newnode->dan);
if(first==NULL)
{
//newnode=(struct node*)malloc(sizeof(struct node));
newnode->link=NULL;
first=newnode;
}
else
{
newnode->link=first;
first=newnode;
}

   fp=fopen("signup.txt","w");
   fprintf(fp,"\nNAME MONTH-NO DANCETYPE \n");
   temp=first;
   if(fp==NULL)
    {
     printf("Error");
    }
   else
    {
     while(temp!=NULL)
      {
       fprintf(fp,"%s \t%d \t%s \t",temp->name,temp->mon,temp->dan);
       fprintf(fp,"\n");
       temp=temp->link;
      }
    }
   fclose(fp);
  }
void del()
{
int aa,ae;
char sname[15];
int pos=1,i=1;
char dele[40];
temp=first;
printf("\nEnter name of member whose record is to be removed\n");
scanf("%s",&dele);
while(temp!=NULL)
{
if(strcmp(dele,temp->name)==0)
{
printf("Information->month joined-%d,dance style-%s",temp->mon,temp->dan);
break;}
else
{
temp=temp->link;
}}temp=first;
printf("\nEnter the month no-the member leaves the dance studio\n");
scanf("%d",&aa);
while(temp!=NULL)
{
if(strcmp(dele,temp->name)==0)
{             strcpy(sname,dele);
ae=aa-temp->mon;
fp=fopen("delete.txt","w");
 //  fprintf(fp,"\nNAME MONTH TYPE \n");
   //temp=first;
   if(fp==NULL)
    {
     printf("Error");
    }
   else
    {
    // while(temp!=NULL)
      //{
      fprintf(fp,"the deleted membership name and month joined-");
       fprintf(fp,"\nthe member name-%s\nmonth joined-%d\n",sname,ae);
       fprintf(fp,"\n");
       //temp=temp->link;

    }
//   fclose(fp);
printf("\n%s attended %d month duration\n",temp->name,ae);
switch(ae)
{
case 1:fprintf(fp,"The dance course not completed.\n");
       fprintf(fp,"Not upgraded to intensive training batch.\n");
       printf("The dance course not completed.\n");
       printf("Not upgraded to intensive training batch.\n");
       break;
case 2:fprintf(fp,"The dance course not completed.\n");
       fprintf(fp,"Not upgraded to intensive training batch.\n");
       printf("The dance course not completed.\n");
       printf("Not upgraded to intensive training batch.\n");
       break;
case 3:fprintf(fp,"The dance course not completed.\n");
       fprintf(fp,"Not upgraded to intensive training batch batch.\n");
       fprintf(fp,"No entry to summer funk held next year.\n");
       printf("The dance course not completed.\n");
       printf("Not upgraded to intensive training batch batch.\n");
       printf("No entry to summer funk held next year.\n");
       break;
case 4:fprintf(fp," Dance course completed.\n");
       fprintf(fp,"Upgraded to senior (high level) batch.\n");
       fprintf(fp,"Upgraded to intensive training batch.\n");
       fprintf(fp,"Entry to summer funk held next year.\n");
       printf(" Dance course completed.\n");
       printf("Upgraded to senior (high level) batch.\n");
       printf("Upgraded to intensive training batch.\n");
       printf("Entry to summer funk held next year.\n");
       break;
       default:printf("Dance course not completed");
       }break;
       }
else{
temp=temp->link;
}
}
temp=first;
next1=first;

if(strcmp(temp->name,dele)!=0)
{
while(strcmp(next1->name,dele)!=0)
{
next1=next1->link;
pos++;
}
temp=first;
while(i<pos-1)
{
temp=temp->link;
i++;
}
next=temp->link;
temp->link=next->link;
free(next);}
else{
first=temp->link;
free(temp);
fclose(fp);
}
}
void display()
{
temp=first;
//while(temp!=NULL)
while(temp->link!=NULL)
{
printf("Name-%s\n",temp->name);
printf("Month joined-%d\n",temp->mon);
printf("Dance style-%s\n",temp->dan);
temp=temp->link;
}   //to print the end node
printf("Name-%s\n",temp->name);
printf("Month joined-%d\n",temp->mon);
printf("Dance style-%s\n",temp->dan);
fp=fopen("record.txt" ,"w");
   fprintf(fp,"\nNAME  MONTH-NO DANCE TYPE \n");
   temp=first;
   if(fp==NULL)
    {
     printf("Error");
    }
   else
    {
     while(temp!=NULL)
      {
       fprintf(fp,"%s \t%d \t%s \t",temp->name,temp->mon,temp->dan);
       fprintf(fp,"\n");
       temp=temp->link;
      }
    }
   fclose(fp);
}
void search()
{
char name1[30];int flag=0;
temp=first;
printf("\nEnter the name of the member whose record is to be found-\n");
scanf("%s",&name1);
while(temp!=NULL)
{
if(strcmp(name1,temp->name)==0)
{
printf("\nMonth no-the member joinedis %d\n",temp->mon);
printf("\nDance style choosen by the member-%s\n",temp->dan);
flag=1;
break;
}
else{
temp=temp->link;
}
}if(flag==0)
{
printf("members record not found\n");
}
}
void main()
{

char op;
int ch;
clrscr();
printf("\n\t\t\tPSEUDO DANCE CREW AND FITNESS\t\t\t\n");
printf("\n\t\t\tWinter Funk Batch\t\t\t\n");
printf("\n\tduration ->\nAugust(month no 8)\nSeptember(month no 9)\nOctober(month no 10)\nNovember(month no 11)\nDecember(month no12)\t\n");
printf("\n\tDance style offered->\n1)Contemporary\n2)Hip-hop\n3)Jazz\t\n");
do
{
printf("\n\tOptions->\t\n");
printf("\n 1.Sign up for membership\n 2.Cancel membership\n 3.Display all members\n 4.Search record of a member\n");
printf("\n enter choice\n");
scanf("%d",&ch);
switch(ch)
{

case 1:  insert();
	break;
case 2: del();
	printf("record of members,having membership in the studio\n");
	display();
	break;
case 3:  display();
	break;
case 4:search();
       break;
default: printf("Invalid choice\n");
}
printf("\nDo you want to continue\n");
op=getche();
}while((op=='y')||(op=='Y'));
getch();
}