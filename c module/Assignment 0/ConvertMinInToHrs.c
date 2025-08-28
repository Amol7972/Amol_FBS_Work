// Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>
int main()
{
	int minutes, hours, remaining_minutes;
	
	printf("Enter the minutes:");
	scanf("%d", &minutes);
	
	hours=minutes/60;
	remaining_minutes=minutes%60;
	
	printf("The hours is: %d", hours);
	printf("The remaining minutes is: %d", remaining_minutes);
}