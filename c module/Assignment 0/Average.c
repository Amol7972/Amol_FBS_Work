// Write a C program to input five numbers and find their average.

#include<stdio.h>
int main()
{
	int no1, no2, no3, no4, no5;
	int sum, average;
	
	printf("Enter the value of No1:");
	scanf("%d", &no1);
	
	printf("Enter the value of No2:");
	scanf("%d", &no2);
	
	printf("Enter the value of No3:");
	scanf("%d", &no3);
	
	printf("Enter the value of No4:");
	scanf("%d", &no4);
	
	printf("Enter the value of No5:");
	scanf("%d", &no5);
	
	sum=no1+no2+no3+no4+no5;
	average=sum/5;
	
	printf("The sum of five numbers is: %d", sum);
	printf("The average of five numbers is: %d", average);
}