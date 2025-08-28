// Write a C program to check whether the given number is even or odd.

#include<stdio.h>
int main()
{
	int no;
	
	printf("Enter the number:");
	scanf("%d", &no);
	
	if(no%2==0)
	{
		printf("No is Even");
	}
	else
	{
		printf("No is Odd");
	}
}