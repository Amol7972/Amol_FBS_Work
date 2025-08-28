// Write a C program to find the area of a circle.

#include<stdio.h>
int main()
{
	float PI=3.14;
	float radius, area;
	
	printf("Enter the radius of a circle:");
	scanf("%f", &radius);
	
	area=PI*radius*radius;
	
	printf("The area of a circle is: %f", area);
}