// Write a C program to check whether the given 3 digit number is pallindrome or not.

/*#include<stdio.h>
int main()
{
	int no;
	int r1,r2,r3,q1,rev;
	
	printf("Enter the 3 digit number:");
	scanf("%d", &no);
	
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	
	rev=r1*100+r2*10+r3;
	
	if(no==rev)
	{
		printf("Pallindrome");
	}
	else
	{
		printf("Not Pallindrome");
	}
}*/

#include<stdio.h>
int main()
{
	int no;
	int fd,ld;
	
	printf("Enter the 3 digit number:");
	scanf("%d", &no);
	
	ld=no%10;
	fd=no/100;
	
	if(fd==ld)
	{
		printf("Pallindrome");
	}
	else
	{
		printf("Not Pallindrome");
	}
}