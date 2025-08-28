// Write a C program to input the base and height of a triangle and calculate its area.

#include<stdio.h>
int main()
{
	float base, height, area;
	
	printf("Enter the base of a triangle:");
	scanf("%f", &base);
	
	printf("Enter the height of a triangle:");
	scanf("%f", &height);
	
	area=0.5*base*height;
	
	printf("Are of a triangle is: %f", area);
}