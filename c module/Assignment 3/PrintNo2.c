// Write a C program for print the numbers using while loop.

#include<stdio.h>
int main()
{
	int no, i=0;
	int ans;
	
	printf("Enter the number:");
	scanf("%d", &no);
	
	while(i<=10)
	{
		ans=no*i;
		
		printf("Print ans: %d \n", ans);
		
		i++;
	}
	
}