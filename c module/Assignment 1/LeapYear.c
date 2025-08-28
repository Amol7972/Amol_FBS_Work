// Write a C program to check whether the given year is leap year.

#include<stdio.h>
int main()
{
	int year;
	
	printf("Enter the year:");
	scanf("%d", &year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		printf("This is a Leap Year");
	}
	else
	{
		printf("This is not a Leap Year");
	}
}