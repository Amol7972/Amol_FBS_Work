// Write a program to check whether a person is eligible to vote.

#include<stdio.h>
void main()
{
	int age;
	
	printf("Please enter a age");
	scanf("%d", &age);
	
	if(age>=18)
	{
		printf("This person is eligible.");
	}
	else
	{
		printf("This person is not eligible");
	}
}