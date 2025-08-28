// Write a C program for Sum of numbers in given range.
// Find sum of numbers from start to end.
// Input: start=1, end=5
// Output: 15

#include<stdio.h>
int main()
{
	int start, end, sum=0;
	int i = start;
	
	printf("Enter start value:");
	scanf("%d", &start);
	
	printf("Enter end value:");
	scanf("%d", &end);
	
	while(i<=end)
	{
		sum=sum+i;
		
		i++;
	}
	
	printf("Sum=%d", sum);
}