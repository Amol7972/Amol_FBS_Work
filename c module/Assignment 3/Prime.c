// Write a C program for check the number is prime or not.
// Input: n=7
// Output: Prime

#include<stdio.h>
int main()
{
	int n, i=2, isPrime=1;
	
	printf("Enter a number:");
	scanf("%d", &n);
	
	if(n<2)
	{
		isPrime=0;
	}
	else
	{
		while (i<=n/2)
		{
			if(n%i==0)
			{
				isPrime=0;
			}
			
			i++;
		}
	}
	
	if(isPrime)
		printf("Prime");
	else
		printf("Not Prime");
}