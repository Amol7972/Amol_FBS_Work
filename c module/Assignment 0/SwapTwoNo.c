// Write a C program to swap two numbers Using a temporary third variable.

#include<stdio.h>
int main()
{
	int a,b,temp;
	
	printf("Enter the value of a:");
	scanf("%d", &a);
	
	printf("Enter the value of b:");
	scanf("%d", &b);
	
	temp=a;
	a=b;
	b=temp;
	
	printf("The swapping two variables of:%d and %d", a,b);
}