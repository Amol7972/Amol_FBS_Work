// Accept the age and check if the person is:
// Child(age<12), Teenager(12-19), Adult(20-59), Senior(60 and above)

#include<stdio.h>
int main()
{
	int age;
	
	printf("Enter the person age:");
	scanf("%d", &age);
	
	if(age>=60)
	{
		printf("This person is Senior");
	}
	else
	{
		if(age>=20 && age<60)
		{
			printf("This person is Adult");
		}
		else
		{
			if(age>=12 && age<20)
			{
				printf("This person is Teenager");
			}
			else
			{
				printf("This person is Child");
			}
		}
	}
}