// Write a C program to Ask user to enter marks
// Then show the results based on these rules:
// If marks are more than 75 ---> show "Distinction"
// If marks are more than 65 ---> show "First Class"
// If marks are more than 55 ---> show "Second Class"
// If marks are 40 or more   ---> show "Pass Class"
// If marks are less than 40 ---> show "Fail"

#include<stdio.h>
int main()
{
	float percentage;
	
	printf("Enter the percentage:");
	scanf("%f", &percentage);
	
	if(percentage>75)
	{
		printf("Distinction");
	}
	else
	{
		if(percentage>65)
		{
			printf("First Class");
		}
		else
		{
			if(percentage>55)
			{
				printf("Second Class");
			}
			else
			{
				if(percentage>=40)
				{
					printf("Pass Class");
				}
				else
				{
					printf("Fail");
				}
			}
		}
	}
}