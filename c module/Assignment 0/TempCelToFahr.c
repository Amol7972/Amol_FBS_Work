// Write a C program to convert temperature form Celsius to Fahrenheit using the formula: F=(c*9/5)+32

#include<stdio.h>
int main()
{
	float celsius, fahrenheit;
	
	printf("Enter the temperature in celsius:");
	scanf("%f", &celsius);
	
	fahrenheit=(celsius*9/5)+32;
	
	printf("The temperature in fahrenheit is:%f", fahrenheit);
}