// Write a C program for find the sum of digits using while loop.

#include<stdio.h>
int main()
{
	int no;
	int r1, sum=0;
	
	printf("Enter the number:");
	scanf("%d", &no);
	
	while(no>0)
	{
		r1=no%10;
		sum=sum+r1;
		no=no/10;
	}
	
	printf("The addition of given number is: %d", sum);
}