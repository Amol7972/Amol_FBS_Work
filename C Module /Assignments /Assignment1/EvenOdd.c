// Write a program to check whether the number is even or odd.

#include<stdio.h>
void main()
{
	int a;
	
	printf("Enter a number");
	scanf("%d", &a);
	
	if(a%2==0)
	{
		printf("Even Number");
	}
	else
	{
		printf("Odd Number");
	}
}