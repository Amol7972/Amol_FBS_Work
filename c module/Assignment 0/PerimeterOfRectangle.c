// Write a C program to input the length and width of a rectangle and find its perimeter.

#include<stdio.h>
int main()
{
	float length, width, perimeter;
	
	printf("Enter the length of a rectangle:");
	scanf("%f", &length);
	
	printf("Enter the width of a rectangle:");
	scanf("%f", &width);
	
	perimeter=2*(length+width);
	
	printf("The perimeter of a rectangle is:%f", perimeter);
}