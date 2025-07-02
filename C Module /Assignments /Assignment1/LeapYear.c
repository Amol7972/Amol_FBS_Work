// Write a program to check whether a given year is a leap year.

#include<stdio.h>
void main()
{
	int year;
	printf("Please enter a year");
	scanf("%d", &year);
	{
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			printf("This is a Leap Year");
		}
		else
		{
			printf("This is not a Leap Year");
		}
	}
}