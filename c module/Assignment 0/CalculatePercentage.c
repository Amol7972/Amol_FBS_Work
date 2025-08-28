// Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.

#include<stdio.h>
int main()
{
	float sub1, sub2, sub3, sub4, sub5;
	float total_marks, percentage;
	
	printf("Enter the marks of Sub1:");
	scanf("%f", &sub1);
	
	printf("Enter the marks of Sub2:");
	scanf("%f", &sub2);
	
	printf("Enter the marks of Sub3:");
	scanf("%f", &sub3);
	
	printf("Enter the marks of Sub4:");
	scanf("%f", &sub4);
	
	printf("Enter the marks of Sub5:");
	scanf("%f", &sub5);
	
	total_marks=sub1+sub2+sub3+sub4+sub5;
	percentage=total_marks/5;
	
	printf("The total marks is: %f", total_marks);
	printf("The percentage of all subject's is: %f", percentage);
	
}