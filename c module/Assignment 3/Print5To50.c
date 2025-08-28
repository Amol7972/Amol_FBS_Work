// Write a C program for print table for given numbers.
// Input: n=5
// Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>
int main()
{
	int n, i=1;
	
	printf("Enter a number:");
	scanf("%d", &n);
	
	while(i<=10)
	{
		printf("%d", n*i);
		
		i++;
	}
}