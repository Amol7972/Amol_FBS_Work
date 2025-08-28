// Write a C program to find the square and cube of a given number.

#include<stdio.h>
int main()
{
	float number, square, cube;
	
	printf("Enter the number:");
	scanf("%f", &number);
	
	square=number*number;
	cube=number*number*number;
	
	printf("The square is: %f", square);
	printf("The cube is: %f", cube);
}