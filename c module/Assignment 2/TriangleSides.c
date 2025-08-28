// Write a C program for Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles or scelene.

#include<stdio.h>
int main()
{
	float a,b,c;
	
	printf("Enter the value of a:");
	scanf("%f", &a);
	
	printf("Enter the value of b:");
	scanf("%f", &b);
	
	printf("Enter the value of c:");
	scanf("%f", &c);
	
	if(a+b>c && a+c>b && b+c>a)
	{
		if(a==b && b==c)
		{
			printf("This is a Equilateral Triangle");
		}
		else
		{
			if(a==b || b==c || a==c)
			{
				printf("This is a Isosceles Triangle");
			}
			else
			{
				printf("The is a Scalene Triangle");
			}
		}
	}

			else
			{
				printf("The given sides do not form a valid triangle");
			}
		}
	
