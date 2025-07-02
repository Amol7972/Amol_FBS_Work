// Write a program to check given 3 digit numbers is pallindrome or not.

#include<stdio.h>

int main()
{
	int number, original, reversed=0, remainder;
	
	printf("Enter 3 digit number is:");
	scanf("%d", &number);
	
	if(number>=100 || number<=999)
		remainder=number%10;
		reversed=reversed*10+remainder;
		number=number/10;
	
	if(original==reversed)
	{
		printf("%d is a pallindrome. \n", original);
	}
	else
	{
		printf("%d is not a pallindrome. \n", original);
	}
	return 0;
}