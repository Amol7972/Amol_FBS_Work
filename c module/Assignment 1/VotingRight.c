// Write a C program to check whether the person is eligible for vote or not.

#include<stdio.h>
int main()
{
	int age;
	
	printf("Enter the age:");
	scanf("%d", &age);
	
	if(age>=18)
	{
		printf("Eligible");
	}
	else
	{
		printf("Not Eligible");
	}
}